package org.example.optional;

import java.util.Optional;

public class OptinalPresent {


    public static void main(String[] args) {

      Optional<String> optinal= Optional.ofNullable(null);
//        System.out.println(optinal.isPresent());
        if(optinal.isPresent()){
//            System.out.println(optinal.get());
        }
        optinal.ifPresent(s-> System.out.println(s));

    }
}
