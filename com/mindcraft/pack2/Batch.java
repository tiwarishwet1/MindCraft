package com.mindcraft.pack2;

public class Batch {
    String courseName;
    int batchStrength;

    public Batch(String courseName, int batchStrength) {
        this.courseName = courseName;
        this.batchStrength = batchStrength;
    }

    public void display() {
        System.out.println("Course: " + courseName);
        System.out.println("Batch Strength: " + batchStrength);
    }
}
