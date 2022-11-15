package org.example.defaults;

public interface Interface4 {

    default void methodA(){
        System.out.println("inside i1"+ Interface4.class);
    }
}
