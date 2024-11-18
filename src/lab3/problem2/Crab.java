package lab3.problem2;

public class Crab implements Crawlable {
    private String type;
    private int claws;

    public Crab() {}

    public Crab(String type, int claws) {
        this.type = type;
        this.claws = claws;
    }

    @Override
    public void crawl() {
        System.out.println("krab = kniga");
    }

    public int getClaws() {
        return claws;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Crab " + "type = " + type  + ", claws = " + claws;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Crab crab = (Crab) obj;
        return claws == crab.claws && type.equals(crab.type);
    }
}
