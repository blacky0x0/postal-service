package com.github.blacky.post.model;

public class Package extends RectangularCuboid {

    public Package(int a) {
        super(a, a, a);
    }

    public Package(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return "Package{" +
                "a=" + a +
                ",b=" + b +
                ",c=" + c +
                '}';
    }

}
