package com.interview.questions.sorting;

public class Input {
    private final static String VALID_INPUT_REGEX = "^(\\d+\\s?)+$";

    public static boolean isValid(String input) {
        if (!input.isEmpty() && input.matches(VALID_INPUT_REGEX)) {
            return true;
        }
        return false;
    }
}
