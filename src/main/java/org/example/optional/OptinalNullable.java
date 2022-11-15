package org.example.optional;

import java.util.Optional;

public class OptinalNullable {

    public static Optional<String>  ofNullbale(){
      Optional<String> optional=  Optional.ofNullable("hello");
      return optional;

    }

    public static Optional<String>  off(){
        Optional<String> optional=  Optional.of(null);
        return optional;

    }
    public static Optional<String>  emptymethod(){

        return Optional.empty();

    }

    public static void main(String[] args) {
        System.out.println(emptymethod());

    }
}
