package lab3.problem3;

import java.util.Comparator;

public class MyTest {
    public static void main(String[] args) {
        MyCollection<Integer> myCollection = new MyArrayList<>();

        myCollection.add(5);
        myCollection.add(3);
        myCollection.add(8);

        System.out.println(myCollection.size());
        System.out.println(myCollection.contains(3));

        for (Integer element : myCollection) {
            System.out.println("Element: " + element);
        }

        myCollection.remove(3);
        System.out.println( myCollection.size());
    }
}
