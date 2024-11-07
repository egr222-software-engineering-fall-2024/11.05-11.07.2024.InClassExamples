package arraylist;

import java.util.ArrayList;

public class VariousRemoval {
    //What is wrong with this code?
    public static void removeAll(ArrayList<String> list, String target){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(target)){
                list.remove(i);
            }
        }
    }

    //Option 1 fix (fix the index after remove)

    //Option 2 fix (remove from the end!)

    //Option 3 fix - Use Iterator!(recommended)

    //Option 4 fix - Make it generic!

    //Option 5 fix - Super duper generic!
}
