package org.example.defaults;

import java.util.List;

public class MupltiplyerImpl implements Mupltiplyer{
    @Override
    public int multiply(List<Integer> integerList) {
       return integerList.stream().reduce(1,(X,Y)-> X*Y);

    }
    public int size(List<Integer>  integerList){
        System.out.println("impl");

        return integerList.size();

    }
}
