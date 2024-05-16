package java8;

interface In {
    default void abc(){
        System.out.println("Hi");
    }
}

interface J {
    default void abc(){
        System.out.println("Hello");
    }
}

class A implements In, J{
    public void abc(){
        In.super.abc();
        J.super.abc();
        // System.out.println("Thanks");
    }
}

public class DefaultMethodInInterface{
    public static void main(String[] args){
        new A().abc();
    }
}
