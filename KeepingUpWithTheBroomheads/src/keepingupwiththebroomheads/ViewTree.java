package keepingupwiththebroomheads;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class ViewTree extends JFrame {

    public ViewTree() {
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();
        graph.getModel().beginUpdate();
        try {
            Object emma = graph.insertVertex(parent, null, "Emma", 20, 20, 80, 30);
            Object tyler = graph.insertVertex(parent, null, "Tyler", 20, 150, 80, 30);
            Object mom = graph.insertVertex(parent, null, "Mom", 240, 20, 80, 30);
            Object dad = graph.insertVertex(parent, null, "Dad", 240, 150, 80, 30);
            graph.insertEdge(parent, null, "Parent/Child", mom, emma);
            graph.insertEdge(parent, null, "Parent/Child", dad, emma);
            graph.insertEdge(parent, null, "Parent/Child", mom, tyler);
            graph.insertEdge(parent, null, "Parent/Child", dad, emma);
        }
        finally {
            graph.getModel().endUpdate();
        }
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);
    }
}
