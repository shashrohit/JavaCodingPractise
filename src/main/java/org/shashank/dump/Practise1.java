package org.shashank.dump;

import java.util.ArrayList;
import java.util.List;

class Super{


}

class Sub extends Super{

}

public class Practise1 {


    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 4, 4, -10, 8 };

        List<Super> list1 = new ArrayList<>();
        List<Sub> list2 = new ArrayList<>();

        list1.add(new Sub());
//        list2.add(new Super());
    }
}
