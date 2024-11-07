package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListClient {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("egr222");
        list.add("world");
        list.add("dr. Han");
        list.add("fun");
        System.out.println(list);

//        list.remove("hello"); //remove the first occurrence
//        System.out.println(list);
//
//        list.remove(0); //remove element at index 0
//        System.out.println(list);
//
//        list.remove(2); //remove element at index 2
//        System.out.println(list);
//
//        list.add(3, "xxx"); //insert xxx at index 3
//        System.out.println(list);
//
//        list.add(3, "yyy"); //insert yyy at index 4
//        System.out.println(list);
//
//        list.add(5, "zzz"); //insert zzz at index 5
//        System.out.println(list);
//
//        System.out.println(list.get(4)); //get element at index 7
//        System.out.println(list);
//
//        Collections.shuffle(list); //shuffle elements in list randomly
//        System.out.println(list);
    }
}
