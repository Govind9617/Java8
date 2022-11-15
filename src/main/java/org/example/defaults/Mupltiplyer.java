package org.example.defaults;

import java.util.List;

public interface Mupltiplyer {

    int multiply(List<Integer> integerList);
    default int size(List<Integer>  integerList){
        System.out.println("interface");

        return integerList.size();

    }
    static boolean isEmpty(List<Integer> integerList){
        return integerList!=null && integerList.size()>0;
    }
}
