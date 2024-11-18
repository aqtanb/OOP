package lab3.problem2;

public class Spider implements Crawlable {
    String species;
    int legs;

    public Spider() {}

    public Spider(String species, int legs) {
        this.species = species;
        this.legs = legs;
    }

    @Override
    public void crawl() {
        System.out.println("pauk (crodetsya)");
    }

    public int getLegs() {
        return legs;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Spider: " + "species = " + species + ", legs = " + legs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Spider spider = (Spider) obj;
        return legs == spider.legs && species.equals(spider.species);
    }
}

