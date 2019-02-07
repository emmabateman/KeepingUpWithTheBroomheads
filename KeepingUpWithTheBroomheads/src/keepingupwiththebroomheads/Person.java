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
    private LinkedList<DirectRelative> children;


    /**
     * constructor
     * @param name name of the person
     */
    public Person(String name) {
        this.name = name;
        this.children = new LinkedList<Person>();
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
