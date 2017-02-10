package com.javarush.test.level15.lesson12.home05;

import java.util.Objects;

/**
 * Created by frenchman on 05.07.2016.
 */
class SubSolution extends Solution {
    public SubSolution() {
    }

    public SubSolution(String a) {
        super(a);
    }

    public SubSolution(int a) {
        super(a);
    }

    protected SubSolution(String a, String b, int c) {
        super(a, b, c);
    }

    protected SubSolution(String a, int b, int c) {
        super(a, b, c);
    }

    protected SubSolution(int a, int b, int c) {
        super(a, b, c);
    }

    SubSolution(Objects o) {
        super(o);
    }

    SubSolution(Float f) {
        super(f);
    }

    SubSolution(Double d) {
        super(d);
    }

    private SubSolution(String a, String b) {

    }
    private SubSolution(String a, int b) {

    }
    private SubSolution(int a, int b) {

    }
}

