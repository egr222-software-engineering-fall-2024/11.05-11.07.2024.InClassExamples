package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeSpanClient {

    public static void main(String[] args) {
        //Declare and define list of TimeSpan objects
        List<TimeSpan> timeSpanList = new ArrayList<>();
        timeSpanList.add(new TimeSpan(5, 34));
        timeSpanList.add(new TimeSpan(8, 1));
        timeSpanList.add(new TimeSpan(1, 56));
        timeSpanList.add(new TimeSpan(0, 27));
        timeSpanList.add(new TimeSpan(2, 0));

        System.out.println("Sorting " + timeSpanList);
//        Collections.sort(timeSpanList);
        System.out.println("   result " + timeSpanList);
    }
}
