package org.example.defaults;

public class Clinent1 implements Inteface1,Interface2,Interface3{
    public void methodA(){
        System.out.println("inside i1" + Clinent1.class);
    }
    public static void main(String[] args) {

        Clinent1 clinent1=new Clinent1();
        clinent1.methodA();
        clinent1.methodB();
        clinent1.methodC();
    }

}
