package Collections.Map;

import Collections.Set.TresSet_;


import java.util.ArrayList;
import java.util.TreeSet;

public class HashMap_ {
    public static void main(String[] args) {


        ArrayList<Integer>li=new ArrayList<>();
        li.add(20);
        li.add(15);
        li.add(34);
        li.add(12);
        li.add(2);

        TreeSet<Integer>ts=new TreeSet<>(li);
                System.out.println(ts);

    }
}
