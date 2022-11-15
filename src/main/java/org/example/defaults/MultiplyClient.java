package org.example.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplyClient {
    public static void main(String[] args) {
        Mupltiplyer mupltiplyer=new MupltiplyerImpl();
        List<Integer> integerList= Arrays.asList(1,2,3,4);
        System.out.println("result is " + mupltiplyer.multiply(integerList));
        System.out.println("result is " + mupltiplyer.size(integerList));
        System.out.println("result is " + Mupltiplyer.isEmpty(integerList));
    }
}
