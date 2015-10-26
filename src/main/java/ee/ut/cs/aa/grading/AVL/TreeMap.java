package ee.ut.cs.aa.grading.AVL;

public interface TreeMap<K extends Comparable<K>,V> {

    /**
     * Adds key and value pair to the tree. If key already exists
     * in the tree then the old value corresponding to the key will be swapped with the
     * new value.
     *
     * @param key
     * @param value
     */
    void add(K key, V value);


    /**
     * Returns value corresponding to the key. If key does not exist
     * then null is returned.
     *
     * @param key
     * @return Value corresponding to the key.
     */
    V get(K key);


    /**
     * Removes key and the value corresponding to the key from the tree. Removed
     * value is returned. Returns null if key does not exist.
     *
     * @param key
     * @return Removed value.
     */
    V remove(K key);


    /**
     *Encodes the underlying binary tree as a string, using following notation
     *
     * [key,value] (left subtree) (right subtree)
     *
     * Empty tree (null) should be represented with empty string.
     *
     * @return String representation of the underlying tree
     */
    String toParenNotation();


    /**
     * Decodes a binary tree from following notation
     *
     * [key,value] (left subtree) (right subtree)
     *
     * Empty tree (null) represented as empty string.
     *
     * Must only work if keys are of type Integer and values of type String.
     *
     * @param tree in notation described above
     * @return TreeMap
     */

    TreeMap<Integer,String> fromParenNotation(String tree);


    /**
     *
     * Suggested method, can be used to visualise the tree using the Drawer helper class.
     *
     * @return Tree converted to BinaryTreeVertex.
     *
     * @see ee.ut.cs.aa.grading.tree.BinaryTreeVertex
     *
     */

    //BinaryTreeVertex<K> toBinaryTreeVertex();
}
