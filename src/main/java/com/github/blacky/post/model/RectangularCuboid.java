package com.github.blacky.post.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * The maximum value for each dimension is 2,147,483,647.
 * For instance: 2,147,483,647 mm = 2,147,483.647 meters.
 */
abstract class RectangularCuboid {

    final int a;
    final int b;
    final int c;

    RectangularCuboid(int a, int b, int c) {
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

}
