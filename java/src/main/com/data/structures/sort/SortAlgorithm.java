package com.data.structures.sort;

import com.data.structures.InvalidInputException;
import com.data.structures.algorithm.Algorithm;

import java.io.BufferedReader;
import java.util.Arrays;

public class SortAlgorithm extends Algorithm {
    private Sort sort;

    public SortAlgorithm(Sort sort) {
        this.sort = sort;
    }

    @Override
    protected void printInstructions() {
        System.out.println("Enter a list of numbers with spaces in between, e.g. 10 20 30.");
    }

    @Override
    public String execute(String input, BufferedReader br) throws InvalidInputException {
        if (SortInput.isValid(input)) {
            Double[] unsortedList = Arrays.stream(input.split(" ")).map(Double::parseDouble).toArray(Double[]::new);
            Double[] sortedList = this.sort.sort(unsortedList);
            return printResult(sortedList);
        } else {
            throw new InvalidInputException("Please enter the numbers in this format e.g. 10 20 30");
        }
    }

    private String printResult(Double[] sortedList) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(this.sort.getName() + " result:\n");
        sb.append(Arrays.toString(sortedList) + "\n");
        return sb.toString();
    }
}