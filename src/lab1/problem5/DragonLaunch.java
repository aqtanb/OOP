package lab1.problem5;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public Boolean willDragonEatOrNot() {
        int counter = 0;
        for (Person person: kidnappedPeople) {
            if (person.gender == Gender.BOY) {
                counter++;
            } else {
                if (counter > 0) {
                    counter--;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

}
