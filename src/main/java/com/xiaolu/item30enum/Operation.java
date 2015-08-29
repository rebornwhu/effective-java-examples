package com.xiaolu.item30enum;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public enum Operation {
    PLUS("+") {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    abstract double apply(double x, double y);

    public static final Map<String, Operation> stringToEnum = new HashMap<String, Operation>();

    static {
        for (Operation op : values())
            stringToEnum.put(op.toString(), op);
    }

    public static Operation fromString(String symbol) {
        return stringToEnum.get(symbol);
    }
}