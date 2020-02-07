package com.github.blacky.post.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Package implements RectangularCuboid {

    private final int a;
    private final int b;
    private final int c;

    public Package(int a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public Package(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void isValid() {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalStateException(String.format("Incorrect dimensions of %s", this));
        }
    }

    public List<Integer> getFacesOrderedByLength() {
        List<Integer> list = Arrays.asList(a, b, c);
        list.sort(Comparator.reverseOrder());
        return list;
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
