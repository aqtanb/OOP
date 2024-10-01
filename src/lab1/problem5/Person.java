package lab1.problem5;

class Person {
private Gender gender;

public Person(Gender gender) {
    this.gender = gender;
}

public Gender getGender() {
    return gender;
}

@Override
public String toString() {
    return gender.name();
}
}