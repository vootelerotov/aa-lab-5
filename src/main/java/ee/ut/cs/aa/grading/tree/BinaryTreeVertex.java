package ee.ut.cs.aa.grading.tree;

/**
 * Vertex for binary tree representation that can hold arbitrary type of data.
 *
 * @param <Data> Type of data that is kept in the vertex.
 * @author Janno Siim
 */
public class BinaryTreeVertex<Data> {

    private BinaryTreeVertex<Data> parent = null;
    private BinaryTreeVertex<Data> leftVertex = null;
    private BinaryTreeVertex<Data> rightVertex = null;

    private Data data = null;

    public BinaryTreeVertex() {
    }

    public BinaryTreeVertex(Data data) {
        this.data = data;
    }

    public BinaryTreeVertex<Data> getLeftVertex() {
        return leftVertex;
    }

    public BinaryTreeVertex<Data> getRightVertex() {
        return rightVertex;
    }

    public void setLeftVertex(BinaryTreeVertex<Data> leftVertex) {

        this.leftVertex = leftVertex;

        if (leftVertex != null) {
            leftVertex.setParent(this);
        }
    }

    public void setRightVertex(BinaryTreeVertex<Data> rightVertex) {
        this.rightVertex = rightVertex;

        if (rightVertex != null) {
            rightVertex.setParent(this);
        }
    }

    public BinaryTreeVertex<Data> getParent() {
        return parent;
    }

    /**
     * Set parent of this node.
     * <p/>
     * Note that this method <b>does not check or set children of the parent node.</b> If you use this method you
     * <b>must</b> do this manually. To avoid this, use {@link #setLeftVertex(ee.ut.cs.aa.grading.tree.BinaryTreeVertex)} or
     * {@link #setRightVertex(ee.ut.cs.aa.grading.tree.BinaryTreeVertex)} on a parent node, both of which automatically update child node.
     *
     * @param parent that will be set for this node
     */
    public void setParent(BinaryTreeVertex<Data> parent) {
        this.parent = parent;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
