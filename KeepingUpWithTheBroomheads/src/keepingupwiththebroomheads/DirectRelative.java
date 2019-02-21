package keepingupwiththebroomheads;
/**
  * @author tyler
  *
  *Represents a person who is related to the family by blood
  */
  public class DirectRelative extends Person {
      private LinkedList<Person> partners;
      private LinkedList<Person> parents; //The first Person in the parents list should be a DirectRelative

      /**
        * constructor
        * @param name name of person
        */
      public DirectRelative(String name) {
        super(name);
        this.partners = new LinkedList<IndirectRelative>();
        this.parents = new LinkedList<Person>();
      }

      /**
       * Returns an array containing this persons partner(s)
       */
      public Person[] getPartners() {
        Person[] partnerArray = new Person[partners.size()];
        for(int i = 0; i < partners.size(); i++) {
          partnerArray[i] = partners.get(i);
        }
        return partnerArray;
      }

      public Person[] getParents() {
        Person[] parentArray = new Person[parents.size()];
        for(int i = 0; i < parents.size(); i++) {
          parentArray[i] = parents.get(i);
        }
        return parentArray;
      }
      /**
       * add a relationship to one of the lists
       * @param relationType The relationship to the person, parent, child, or partner
       * @param person person object being added to list
       */
      public void addRelation(String relationType, Person person){
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



  }
