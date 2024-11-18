package lab3.problem5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d, %02d, %02d", hour, minute, second);
    }

    public String toStandard() {
        int formatedHour = (hour % 12 == 0) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d, %02d, %02d, %s", formatedHour, minute, second, period);
    }

    public void add(Time other) {
        this.second += second;
        this.minute += minute + second / 60;
        this.hour += hour + minute / 60;
        this.second %= 60;
        this.minute %= 60;
        this.second %= 24;
    }

    @Override
    public int compareTo(Time other) {
        if(this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        } else if(this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        } else {
            return Integer.compare(this.second, other.second);
        }
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}