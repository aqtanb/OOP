package lab1.problem5;

import java.util.Vector;

class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedPeople.add(p);
    }

    public boolean willDragonEatOrNot() {
        int count = 0;

        for (Person person : kidnappedPeople) {
            if (person.getGender() == Gender.BOY) {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    return true;
                }
            }
        }

        return count != 0;
    }
}

