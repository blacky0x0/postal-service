package com.github.blacky.post;

import com.github.blacky.post.model.Box;
import com.github.blacky.post.model.Package;

import java.util.List;
import java.util.Objects;

public class PostService {

    public boolean isPackageFitInBox(Package pack, Box box) {
        Objects.requireNonNull(pack, "The package is null!");
        Objects.requireNonNull(box, "The box is null!");

        pack.isValid();
        box.isValid();

        List<Integer> boxFaces = box.getFacesOrderedByLength();
        List<Integer> packFaces = pack.getFacesOrderedByLength();
        for (int i = 0; i < boxFaces.size(); i++) {
            if (boxFaces.get(i) < packFaces.get(i)) {
                return false;
            }
        }

        return true;
    }

}
