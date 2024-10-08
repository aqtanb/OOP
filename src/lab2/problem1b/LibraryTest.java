package lab2.problem1b;

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem() {};
        item.setTitle("Title");
        item.setAuthor("Author");
        item.setPublicationYear(1984);
        System.out.println(item);
        Grimoire grimoire = new Grimoire(item.getTitle(), item.getAuthor(), item.getPublicationYear(), Suit.CLOVER);
        System.out.println(grimoire);
    }
}
