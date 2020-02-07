package com.github.blacky.post.model;

public class Box extends RectangularCuboid {

    public Box(int a) {
        super(a, a, a);
    }

    public Box(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ",b=" + b +
                ",c=" + c +
                '}';
    }

}
