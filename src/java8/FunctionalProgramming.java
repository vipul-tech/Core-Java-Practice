package java8;

class Demo {
    public Demo(){
        System.out.println("Demo object created...");
    }
    public Demo(String str){
        System.out.println("Demo object created..."+str);
    }
}

interface Int {
    void getObject();
}

public class FunctionalProgramming {
    public static void main(String[] args){
        Int i1 = Demo::new;   //constructor reference
        i1.getObject();
    }
}
