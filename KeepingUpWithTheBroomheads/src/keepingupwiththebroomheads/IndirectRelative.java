package keepingupwiththebroomheads;
/**
  *@author tyler
  *Represents a person not related to the family by blood, i.e. a spouse/partner
  */
public class IndirectRelative extends Person {
    //They may have other partners, but the only one relavent here is the one directly related to the family
    DirectRelative partner;

    /**
      * constructor
      * @param name name of person
      */
    public IndirectRelative(name) {
        super(name);
        this.partner = new DirectRelative();
    }

    /**
     * Returns null
     * Parents are only tracked for direct relatives
     */
    public Person[] getParents() {
      return null;
    }

    /**
     * Returns an array containing this person's directRelative partner
     */
    public Person[] getPartners() {
      Person[] partners = {partner};
      return partners;
    }

    /**
     * add a relationship to one of the lists
     * @param relationType The relationship to the person
     * @param person person object being added to list
     */
    public void addRelation(String relationType, Person person) {
      if (relationType.equals("child")) {
          this.children.add(person);
      }
      else if (relationType.equals("partner")) {
          this.partner = person;
      }
    }
}
