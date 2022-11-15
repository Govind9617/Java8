package org.example.defaults;

public interface Inteface1 {
    default void methodA(){
        System.out.println("inside i1"+ Inteface1.class);
    }
}
