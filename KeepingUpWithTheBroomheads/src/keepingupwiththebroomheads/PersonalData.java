/** Author: Tyler
  * Date: 25 March 2019
  *
  * This class stores personal details about a person
  */

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
}
