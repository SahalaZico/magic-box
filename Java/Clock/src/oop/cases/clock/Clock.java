package oop.cases.clock;

/**
 *
 * @author Sahala Zico
 */
public class Clock {

    //Class attributes
    static private final int MAX_HOUR = 24;
    static private final int MAX_MINUTE = 60;
    static private final int MAX_SECOND = 60;

    //Instance attributes
    private int hour;
    private int minute;
    private int second;

    //Constructor method
    public Clock() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Clock(int _hour, int _minute, int _second) {
        hour = _hour;
        minute = _minute;
        second = _second;
    }

    //Getter-Setter method
    public int getHour() {
        return hour;
    }

    public void setHour(int _hour) {
        if (_hour >= 0 && _hour <= MAX_HOUR) {
            hour = _hour;
        } else {
            hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int _minute) {
        if (_minute >= 0 && _minute <= MAX_MINUTE) {
            minute = _minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int _second) {
        if (_second >= 0 && _second <= MAX_SECOND) {
            second = _second;
        }
    }

    //Method to add 1 hour
    public void tickHour() {
        this.hour++;
        if (this.hour > MAX_HOUR) {
            this.hour = this.hour % MAX_HOUR;
        }
    }

    //Method to add 1 minute
    public void tickMinute() {
        this.minute++;
        if (this.minute > MAX_MINUTE) {
            this.minute = this.minute % MAX_MINUTE;
            tickHour();
        }
    }

    //Method to add 1 second
    public void tickSecond() {
        this.second++;
        if (this.second > MAX_SECOND) {
            this.second = this.second % MAX_SECOND;
            tickMinute();
        }
    }

    //To print the time
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
       
    }

}
