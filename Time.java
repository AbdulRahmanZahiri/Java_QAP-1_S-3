// Time class representing a simple time format (HH:MM:SS)
public class Time {
    private int hour;   // Hour (0-23)
    private int minute; // Minute (0-59)
    private int second; // Second (0-59)

    // Constructor to initialize time with specified hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter method to retrieve the hour
    public int getHour() {
        return hour;
    }

    // Setter method to update the hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Getter method to retrieve the minute
    public int getMinute() {
        return minute;
    }

    // Setter method to update the minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Getter method to retrieve the second
    public int getSecond() {
        return second;
    }

    // Setter method to update the second
    public void setSecond(int second) {
        this.second = second;
    }

    // Method to update time with new hour, minute, and second values
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Returns a formatted string representation of the time in HH:MM:SS format
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Increments the time by one second and updates hours/minutes accordingly
    public Time nextSecond() {
        second++; // Increment second
        if (second >= 60) { // If second overflows, reset and increment minute
            second = 0;
            minute++;
            if (minute >= 60) { // If minute overflows, reset and increment hour
                minute = 0;
                hour++;
                if (hour >= 24) { // If hour overflows, reset to 0 (24-hour format)
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Decrements the time by one second and updates hours/minutes accordingly
    public Time previousSecond() {
        second--; // Decrement second
        if (second < 0) { // If second underflows, set to 59 and decrement minute
            second = 59;
            minute--;
            if (minute < 0) { // If minute underflows, set to 59 and decrement hour
                minute = 59;
                hour--;
                if (hour < 0) { // If hour underflows, set to 23 (24-hour format)
                    hour = 23;
                }
            }
        }
        return this;
    }
}
