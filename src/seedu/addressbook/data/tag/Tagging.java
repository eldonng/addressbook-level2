package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    Person person;
    Tag tag;
    boolean isAdded;

    /**Assuming that you can add or remove tags, this class is used when add or delete tags command is used
     *
     * @param person passes the person that has their tags edited
     * @param tag the tag that is added/removed
     * @param isAdded check whether tag is being removed or added
     */
    public Tagging(Person person, Tag tag, boolean isAdded) {
        this.person = person;
        this.tag = tag;
        this.isAdded = isAdded;
    }

    /**
     *
     * @return returns whether the tag is deleted or added for the person
     */
    public String toString() {
        if(isAdded) {
            return "+ " + person.getName() + " " + tag.toString();
        }
        else
            return "- " + person.getName() + " " + tag.toString();
    }
}
