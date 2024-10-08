package lab2.problem1c;

public class CardTest {
    public static void main(String[] args) {
        Card card = new Card();
        card.setColor("White");
        card.setExpireDate(1984);
        System.out.println(card);
        Id id = new Id(132542354);
        System.out.println(id);
        System.out.println(card.equals(id));

        Id anotherId = new Id(132542354);
        System.out.println(id.equals(anotherId));

        int firstHash = id.hashCode();
        int secondHash = anotherId.hashCode();
        System.out.println(firstHash == secondHash);
        System.out.println(firstHash);
    }
}
