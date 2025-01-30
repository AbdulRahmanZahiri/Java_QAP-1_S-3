// Write a test program called TestTime (in another source file called TestTime.java) which uses the Time class.
public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(12, 16, 45);
        Time t2 = new Time(8, 18, 15);

        // Display the initial times for t1 and t2 using toString() method
        t1.nextSecond();
        t2.previousSecond();

        // Display the times for t1 and t2 after incrementing and decrementing
        System.out.println("Time t1 after nextSecond: " + t1.toString());
        System.out.println("Time t2 after previousSecond: " + t2.toString());
    }
}
