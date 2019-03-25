package keepingupwiththebroomheads;

import javax.swing.JFrame;

import java.util.Iterator;
import java.util.LinkedList;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class ViewTree extends JFrame {

    public ViewTree(Person root, int frameWidth, int frameHeight) {
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();
        graph.getModel().beginUpdate();
        try {
        	Object root_node = graph.insertVertex(parent, null, root.data.getName(), 200, 50, 50, 10);
        	for (int i = 0; i < root.relations.getChildren().size(); i++) {
           		Object child = graph.insertVertex(parent,null, root.relations.getChildren().get(i).data.getName(), (frameWidth/root.relations.getChildren().size())*i, 200, 50, 10);
        		graph.insertEdge(parent, null, null, root_node, child);
        	}
        }
        finally {
            graph.getModel().endUpdate();
        }
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        getContentPane().add(graphComponent);
    }
}
