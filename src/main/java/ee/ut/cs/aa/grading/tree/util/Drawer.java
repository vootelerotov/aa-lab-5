package ee.ut.cs.aa.grading.tree.util;

import ee.ut.cs.aa.grading.tree.BinaryTreeVertex;

/**
 *
 * Draws BinaryTreeVertex
 */
public interface Drawer {

    <T> void  draw(BinaryTreeVertex<T> tree);
}
