package org.example.defaults;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("inside i3");
    }
}
