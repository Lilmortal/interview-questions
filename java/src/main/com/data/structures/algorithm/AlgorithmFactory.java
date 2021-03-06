package com.data.structures.algorithm;

import com.data.structures.InvalidInputException;
import com.data.structures.graph.GraphFactory;
import com.data.structures.graph.GraphIntroAlgorithm;
import com.data.structures.graph.GraphResource;
import com.data.structures.hashTable.HashTableAlgorithm;
import com.data.structures.heap.HeapFactory;
import com.data.structures.heap.HeapIntroAlgorithm;
import com.data.structures.heap.HeapResource;
import com.data.structures.linkedList.LinkedListAlgorithm;
import com.data.structures.queue.QueueAlgorithm;
import com.data.structures.sort.SortFactory;
import com.data.structures.sort.SortIntroAlgorithm;
import com.data.structures.sort.SortResource;
import com.data.structures.stack.StackAlgorithm;
import com.data.structures.tree.TreeFactory;
import com.data.structures.tree.TreeIntroAlgorithm;
import com.data.structures.tree.TreeResource;

public class AlgorithmFactory {
    public Algorithm getAlgorithm(String algorithmName) throws InvalidInputException {
        switch (algorithmName) {
            case "linked list": {
                return new LinkedListAlgorithm();
            }

            case "queue": {
                return new QueueAlgorithm();
            }

            case "stack": {
                return new StackAlgorithm();
            }

            case "hash table": {
                return new HashTableAlgorithm();
            }

            case "sorting": {
                SortFactory sortFactory = new SortFactory();
                SortResource sortResource = new SortResource(sortFactory);
                return new SortIntroAlgorithm(sortResource);
            }

            case "heap": {
                HeapFactory heapFactory = new HeapFactory();
                HeapResource heapResource = new HeapResource(heapFactory);
                return new HeapIntroAlgorithm(heapResource);
            }

            case "tree": {
                TreeFactory treeFactory = new TreeFactory();
                TreeResource treeResource = new TreeResource(treeFactory);
                return new TreeIntroAlgorithm(treeResource);
            }

            case "graph": {
                GraphFactory graphFactory = new GraphFactory();
                GraphResource graphResource = new GraphResource(graphFactory);
                return new GraphIntroAlgorithm(graphResource);
            }

            default: {
                throw new InvalidInputException();
            }
        }
    }
}
