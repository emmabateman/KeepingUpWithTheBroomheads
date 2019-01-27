/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keepingupwiththebroomheads;

import java.util.LinkedList;
/**
 *
 * @author emma
 */
public class Person {
    private String name;
    
    private LinkedList<Person> parents;
    private LinkedList<Person> children;
    private LinkedList<Person> partners;
    
    public Person(String name) {
        this.name = name;
        this.parents = new LinkedList<Person>();
        this.children = new LinkedList<Person>();
        this.partners = new LinkedList<Person>();
    }
    
    public void addRelation(String relationType, Person person) {
        if (relationType.equals("parent")) {
            this.parents.add(person);
        }
        else if (relationType.equals("child")) {
            this.children.add(person);
        }
        else if (relationType.equals("partner")) {
            this.partners.add(person);
        }
    }
    
    public String getName() {
        return this.name;
    }
    
}
