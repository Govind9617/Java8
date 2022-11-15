package org.example.defaults;

public class Clint14 implements Inteface1,Interface4{
    @Override
    public void methodA() {
        System.out.println("indise"+ Clint14.class);

    }

    public static void main(String[] args) {
        Clint14 clint14
                =new Clint14();
        clint14.methodA();
    }
}
