package ee.ut.cs.aa.grading.AVL.generator;

/**
 * Generates strings that can be converted to TreeMap<Integer,String>
 */

public interface TreeGenerator {


    /**
     * Generates a parenthesis notation of an balanced binary search tree.
     *
     * @see ee.ut.cs.aa.grading.AVL.TreeMap#fromParenNotation(String tree)
     *
     * @param n the height of the generated tree
     * @return the generated tree as string
     */
    String generate(int n);

}
