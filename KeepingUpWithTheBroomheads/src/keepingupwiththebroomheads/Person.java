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
 *
 * represent a person and the connections that tie them to the family tree
 */
public abstract class Person {
    private String name;
    private LinkedList<Person> children;

    /**
     * constructor
     * @param name name of the person
     */
    public Person(String name) {
        this.name = name;
        this.children = new LinkedList<Person>();
    }
    /**
     * Returns an array containing the parents of the given person. If the person is an
     * indirectRelative, their parents are irrelevent and null is returned.
     */
    abstract Person[] getParents();

    /**
     * Returns an array containing every relevant partner the person has had.
     * If they have no partners, returns an empty array
     */
    abstract Person[] getPartners();

    /**
     * Returns an array containing this person's children.
     * If they have no children, an empty array is returned.
     */
    public Person[] getChildren() {
      Person[] childArray = new Person[children.size()];
      for(int i = 0; i < children.size(); i++) {
        childArray[i] = children.get(i);
      }
      return childArray;
    }
    /**
     * add a relationship to one of the lists
     * @param relationType The relationship to the person
     * @param person person object being added to list
     */
    abstract void addRelation(String relationType, Person person);




    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

}
