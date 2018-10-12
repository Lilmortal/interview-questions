package com.data.structures.graph;

import com.data.structures.InvalidInputException;
import com.data.structures.heap.Heap;

public class GraphResource {
    private GraphFactory graphFactory;

    public GraphResource(GraphFactory graphFactory) {
        this.graphFactory = graphFactory;
    }

    public Graph getGraph(String graph) throws InvalidInputException {
        switch (graph) {
            case "1": {
                return graphFactory.getGraph("minHeap");
            }
            case "2": {
                return graphFactory.getGraph("maxHeap");
            }
            default: {
                throw new InvalidInputException("Invalid input");
            }
        }
    }
}
