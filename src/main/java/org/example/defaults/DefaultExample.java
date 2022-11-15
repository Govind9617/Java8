package org.example.defaults;

import java.util.*;

public class DefaultExample {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("adam","jenny","alex","erik");
    //    Collections.sort(list);
//        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
