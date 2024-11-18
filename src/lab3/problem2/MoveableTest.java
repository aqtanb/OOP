package lab3.problem2;

public class MoveableTest {
    public static void main(String[] args) {
        Crawlable spider = new Spider("Tarantula", 8);
        spider.crawl();
        Crawlable crab = new Crab("Blue Crab", 2);
        crab.crawl();

        System.out.println(spider);
        System.out.println(crab);

        System.out.println(spider.equals(new Spider("Tarantula", 8)));
    }
}
