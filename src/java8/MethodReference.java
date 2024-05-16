package java8;

class B {
    public static void demo() {
        for(int i=0;i<10;i++){
            System.out.println("B : " + i);
        }
    }
    public void abc() {
        for(int i=0;i<10;i++){
            System.out.println("abc : " + i);
        }
    }
}

public class MethodReference {
    public static void main(String[] args) {
        Thread t1 = new Thread(B::demo);
        Thread t2 = new Thread(new B()::abc);
        t1.start();
        t2.start();
        for(int i=0;i<10;i++){
            System.out.println("main: " + i);
        }
    }
}
