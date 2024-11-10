package comparable;

// Represents a time span of hours and minutes elapsed.
// Class invariant: minutes < 60

//Make this code implement Comparable interface
public class TimeSpan implements Comparable<TimeSpan> {
    private int hours;
    private int minutes;

    // Constructs a time span with the given interval.
    // pre: hours >= 0 && minutes >= 0
    public TimeSpan(int hours, int minutes) {
        this.hours = 0;
        this.minutes = 0;
        add(hours, minutes);
    }

    // Adds the given interval to this time span.
    // pre: hours >= 0 && minutes >= 0
    public void add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;

        // convert each 60 minutes into one hour
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    // Returns the number of minutes stored in this TimeSpan object.
    public int getHours() {
        return hours;
    }

    // Returns the number of minutes stored in this TimeSpan object.
    public int getMinutes() {
        return minutes;
    }

    // Returns a String for this time span such as "6h15m".
    public String toString() {
        return hours + "h" + minutes + "m";
    }

    @Override
    public int compareTo(TimeSpan o) {
        if (this.hours == o.hours) {
            // hours are the same - return the difference in minutes
            return this.minutes - o.minutes;
        }
        // hours are different - return the difference in hours
        return this.hours - o.hours;
    }

    // YOUR CODE GOES HERE

}