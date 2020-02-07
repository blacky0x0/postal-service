package com.github.blacky.post;

import com.github.blacky.post.model.Box;
import com.github.blacky.post.model.Package;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostServiceTest {

    private PostService service = new PostService();

    @Test
    public void positiveScenariosTest() {
        /* check cubes */
        assertTrue(service.isPackageFitInBox(new Package(1), new Box(1)));
        assertTrue(service.isPackageFitInBox(new Package(2), new Box(2)));
        /* the order of the faces does not affect the final result */
        assertTrue(service.isPackageFitInBox(new Package(15, 12, 2), new Box(15, 12, 2)));
        assertTrue(service.isPackageFitInBox(new Package(2, 12, 15), new Box(12, 2, 15)));
        /* check with the limits */
        assertTrue(service.isPackageFitInBox(new Package(Integer.MAX_VALUE), new Box(Integer.MAX_VALUE)));
    }

    @Test
    public void negativeScenariosTest() {
        /* one of the package's faces doesn't fit the corresponding one  */
        assertFalse(service.isPackageFitInBox(new Package(15, 7, 2), new Box(13, 7, 2)));
        assertFalse(service.isPackageFitInBox(new Package(15, 7, 2), new Box(15, 6, 2)));
        assertFalse(service.isPackageFitInBox(new Package(15, 7, 2), new Box(15, 7, 1)));
        /* the order of the faces does not affect the final result */
        assertFalse(service.isPackageFitInBox(new Package(15, 7, 3), new Box(15, 12, 2)));
        assertFalse(service.isPackageFitInBox(new Package(3, 7, 15), new Box(2, 12, 15)));
        assertFalse(service.isPackageFitInBox(new Package(2), new Box(1, 2, 2)));
        assertFalse(service.isPackageFitInBox(new Package(2), new Box(2, 1, 2)));
        assertFalse(service.isPackageFitInBox(new Package(2), new Box(2, 2, 1)));
        assertTrue(service.isPackageFitInBox(new Package(1), new Box(2, 1, 1)));
        assertTrue(service.isPackageFitInBox(new Package(1), new Box(1, 2, 1)));
        assertTrue(service.isPackageFitInBox(new Package(1), new Box(1, 1, 2)));
    }

    @Test(expected = IllegalStateException.class)
    public void zeroBox() {
        service.isPackageFitInBox(new Package(1), new Box(0));
        fail();
    }

    @Test(expected = IllegalStateException.class)
    public void zeroPackage() {
        service.isPackageFitInBox(new Package(0), new Box(1));
        fail();
    }

    @Test(expected = IllegalStateException.class)
    public void negativeDimensionsBox() {
        service.isPackageFitInBox(new Package(1), new Box(-1));
        fail();
    }

    @Test(expected = IllegalStateException.class)
    public void negativeDimensionsPackage() {
        service.isPackageFitInBox(new Package(-1), new Box(1));
        fail();
    }

    @Test(expected = NullPointerException.class)
    public void nullPackage() {
        service.isPackageFitInBox(null, new Box(1));
        fail();
    }

    @Test(expected = NullPointerException.class)
    public void nullBox() {
        service.isPackageFitInBox(new Package(1), null);
        fail();
    }

}