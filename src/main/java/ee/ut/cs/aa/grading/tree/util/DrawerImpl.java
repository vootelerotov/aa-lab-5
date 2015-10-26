package ee.ut.cs.aa.grading.tree.util;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import ee.ut.cs.aa.grading.tree.BinaryTreeVertex;

import javax.swing.*;

/**
 * Implements drawer
 */
public class DrawerImpl implements Drawer {



    @Override
    public <T> void draw(BinaryTreeVertex<T> tree) {
        mxGraph graph = new mxGraph();
        graph.getModel().beginUpdate();
        draw(graph,null, tree, 490, 20,0);
        graph.getModel().endUpdate();
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,600);
        frame.getContentPane().add(graphComponent);
        frame.setVisible(true);
    }

    private <T> void draw(mxGraph graph,Object parentNode,BinaryTreeVertex<T> tree, int x, int y,int level) {
        Object v =graph.insertVertex(graph.getDefaultParent(),null, tree.getData() == null?"":tree.getData().toString(),x,y,20,20);
        if (parentNode != null){
            graph.insertEdge(graph.getDefaultParent(),null,null,parentNode,v);
        }
        int childY = y + 80;
        int childXDelta = 256/((int)Math.pow(2,level));
        if (tree.getLeftVertex() != null){
            draw(graph,v,tree.getLeftVertex(),x-childXDelta,childY,level+1);
        }
        if (tree.getRightVertex() != null){
            draw(graph,v,tree.getRightVertex(),x+childXDelta,childY, level +1);
        }
    }

}
