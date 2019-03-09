package com.javarush.task.task14.task1408;

public abstract class Hen {
    String getDescription() {
        return "Я - курица.";
    }
    abstract int getCountOfEggsPerMonth();
}
