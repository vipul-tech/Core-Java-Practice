package java8;

import java.util.*;
import java.util.function.*;

class ConsumerInterfaceExample{
    static void printMessage(String name){
        System.out.println("From printMessage : " + name);
    }

    static void printValue(int value){
        System.out.println("From printValue : " + value);
    }

    static void printList(List list){
        list.forEach(System.out::println);
    }
}

public class ForEachMethod2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);

        Consumer<String> c1 = ConsumerInterfaceExample::printMessage;
        c1.accept("Vipul");

        Consumer<Integer> c2 = ConsumerInterfaceExample::printValue;
        c2.accept(234);

        Consumer<List> c3 = ConsumerInterfaceExample::printList;
        c3.accept(list);
    }
}
