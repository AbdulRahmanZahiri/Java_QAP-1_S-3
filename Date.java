// Date class representing a simple date with day, month, and year
public class Date {
    private int day;    // Day of the month (1-31)
    private int month;  // Month of the year (1-12)
    private int year;   // Year value

    // Constructor to initialize the date with provided day, month, and year
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter method to retrieve the day
    public int getDay() {
        return day;
    }

    // Setter method to update the day
    public void setDay(int day) {
        this.day = day;
    }

    // Getter method to retrieve the month
    public int getMonth() {
        return month;
    }

    // Setter method to update the month
    public void setMonth(int month) {
        this.month = month;
    }

    // Getter method to retrieve the year
    public int getYear() {
        return year;
    }

    // Setter method to update the year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to update the date with new day, month, and year values
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returns a formatted string representation of the date in dd/mm/yyyy format
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
