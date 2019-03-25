/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keepingupwiththebroomheads;

import java.util.*;
/**
 *
 * @author Tyler
 *
 * represent a person and the connections that tie them to the family tree
 */
public class Person implements Comparable<Person>{
    public RelationData relations;
    public PersonalData data;

    public Person(String name, int birthday) {
      relations = new RelationData();
      data = new PersonalData(name, birthday);
    }

    /** Adds a relation to the family tree structure.
      * Returns true if the relation was successfully added */
    public boolean addRelation(String type, Person relative) {
      switch (type) {
        case "child":
          return relations.addChild(relative);
        case "parent":
          return relations.addParent(relative);
        case "partner":
          return relations.addPartner(relative);
        default:
          return false;
      }
    }


    @Override
    public int compareTo(Person other) {
      return this.data.compareTo(other.data);
    }

    @Override
    public boolean equals(Object obj) {
      if(obj.getClass().isInstance(this)) {
        Person other = this.getClass().cast(obj);
        return this.data.equals(other.data);
      } else {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return data.hashCode();
    }
    public class RelationData{
      private Set<Person> parents;
      private SortedSet<Person> children;
      private Set<Person> partners;

      public RelationData() {
        parents = new HashSet<Person>();
        children = new TreeSet<Person>();
        partners = new LinkedHashSet<Person>();
      }

      /** Inserts a child into the children SortedSet
        * Returns true if the child was not already added, otherwise returns false
        */
      public boolean addChild(Person child) {
        return children.add(child);
      }

      /** Adds a parent to the parents Set
        * Returns true if the parent was not already added, otherwise returns false
        */
      public boolean addParent(Person parent) {
        return parents.add(parent);
      }

      /** Adds a partner to the partners Set
        * Returns true if the partner was not already added, otherwise returns false
        */
      public boolean addPartner(Person partner) {
        return partners.add(partner);
      }

      /** Returns a LinkedList containing this person's children in order of age */
      public LinkedList<Person> getChildren() {
        Iterator<Person> i = children.iterator();
        LinkedList<Person> childList = new LinkedList<Person>();
        while(i.hasNext()) {
          childList.add(i.next());
        }
        return childList;
      }

      /** Returns a LinkedList containing this person's parents in no particular
      order */
      public LinkedList<Person> getParents() {
        Iterator<Person> i = parents.iterator();
        LinkedList<Person> parentList = new LinkedList<Person>();
        while(i.hasNext()) {
          parentList.add(i.next());
        }
        return parentList;
      }

      /** Returns a LinkedList containing this person's partners in the order they
        * were added. */
      public LinkedList<Person> getPartners() {
        Iterator<Person> i = partners.iterator();
        LinkedList<Person> partnerList = new LinkedList<Person>();
        while(i.hasNext()) {
          partnerList.add(i.next());
        }
        return partnerList;
      }
    }

    public class PersonalData implements Comparable<PersonalData> {
      // YYYYMMDD
      private int birthday;
      private String name;

      public PersonalData(String name, int birthday) {
        this.birthday = birthday;
        this.name = name;
      }

      public int getBirthday() {
        return birthday;
      }

      public String getName() {
        return name;
      }

      @Override
      public int compareTo(PersonalData other) {
        return this.getBirthday() - other.getBirthday();
      }

      @Override
      public boolean equals(Object obj) {
        if(obj.getClass().isInstance(this)) {
          PersonalData other = this.getClass().cast(obj);
          return this.getName().equals(other.getName()) && this.getBirthday() == other.getBirthday();
        } else {
          return false;
        }
      }

      @Override
      public int hashCode() {
        return name.hashCode() + birthday;
      }
    }


>>>>>>> familytree
}
