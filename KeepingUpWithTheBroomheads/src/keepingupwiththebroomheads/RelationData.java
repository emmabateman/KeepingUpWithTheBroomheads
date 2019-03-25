/** Author: Tyler
  * 25 March 2019
  *
  * This class stores the various relationships of a given person
  */
import java.util.*;

public class RelationData{
  private Set<Person> parents;
  private SortedSet<Person> children;
  private Set<Person> partners;

  public RelationData() {
    parents = new HashSet<Person>();
    children = new TreeSet<Person>();
    partners = new LinkedHashSet<Person>();
  }

  /* Inserts a child into the children SortedSet */
  public void addChild(Person child) {
    children.add(child);
  }

  /* Adds a parent to the parents Set */
  public void addParent(Person parent) {
    parents.add(parent);
  }

  /* Adds a partner to the partners Set*/
  public void addPartner(Person partner) {
    partners.add(partner);
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
    return parnterList();
  }
}
