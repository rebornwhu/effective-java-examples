package com.xiaolu.item41_overloading_judiciously;

public class Overriding {

    public static void main(String[] args) {
        Wine[] wines = {new Wine(), new SparklingWine(), new Champagne()};

        for (Wine wine : wines)
            System.out.println(wine.name());
    }
}
