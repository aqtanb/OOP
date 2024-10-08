package lab2.problem1c;

import java.util.Objects;

public class Card {
    private String color;
    private int expireDate;

    public Card(String color, int expireDate) {
        this.color = color;
        this.expireDate = expireDate;
    }

    public Card() {}


    public int getExpireDate() {
        return expireDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setExpireDate(int expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Card color: " + color + " , expire date: " + expireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Card other)) return false;
        return Objects.equals(color, other.color) && expireDate == other.expireDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, expireDate);
    }
}
