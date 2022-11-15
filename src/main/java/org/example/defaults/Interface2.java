package org.example.defaults;

public interface Interface2 extends Inteface1 {
    default void methodB(){
        System.out.println("inside i2");
    }
    default void methodA(){
        System.out.println("inside i1"+ Interface2.class);
    }
}
