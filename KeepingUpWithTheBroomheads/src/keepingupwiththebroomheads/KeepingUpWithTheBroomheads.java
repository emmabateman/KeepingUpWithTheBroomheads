/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keepingupwiththebroomheads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedList;

/**
 *
 * @author emma
 */
public class KeepingUpWithTheBroomheads {
    public static LinkedList<Person> Family;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        java.awt.EventQueue.invokeLater(() -> {
            BroomheadJFrame frame = new BroomheadJFrame();
            frame.setVisible(true);
        });
        
        Family = new LinkedList<Person>();
        loadFromCSV("family.csv");
        
    }
    
    public static void loadFromCSV(String filename) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] entry = line.split(",");
            int idx = Integer.parseInt(entry[0]);
            String name = entry[1];
            Person me = new Person(name);
            String[] parents = new String[0];
            String[] partners = new String[0];
            if (entry.length > 2 && ! entry[2].equals("")) {
                parents = entry[2].split(";");
            }
            if (entry.length > 3 && ! entry[3].equals("")) {
                partners = entry[3].split(";");
            }
            for (int i = 0; i < parents.length; i++) {
                Person parent = Family.get(Integer.parseInt(parents[i]));
                me.addRelation("parent", parent);
                parent.addRelation("child", me);
            }
            for (int i = 0; i < partners.length; i++) {
                Person partner = Family.get(Integer.parseInt(partners[i]));
                me.addRelation("partner", partner);
                partner.addRelation("partner", me);
            }
            
            Family.add(me);
        }
        
    }
    
}
