package lab2.problem1b;

public class Grimoire extends LibraryItem {
    private Suit suit;
    public Grimoire(String title, String author, int year, Suit suit) {
        super(title, author, year);
        this.suit = suit;
    }
    public Grimoire() {}

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return super.toString() + " , Suit: " + suit;
    }
}
