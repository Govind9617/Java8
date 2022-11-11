package org.example.funtionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    BiConsumer<String,String> consumer=(a,b)->System.out.println("a:" + a + ",b" + b);
}
