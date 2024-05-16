package java8;

interface Inte {
    void abc();
}
// class A implements I {
//     public void abc(){
//         System.out.println("Hello World!");
//     }
// }
public class LambdaExpression {
    public static void main(String[] args){
        //Anonymous class
        // I i = new I(){
        //     public void abc(){
        //         System.out.println("Hello World!");
        //     }
        // };

        //Lambda expression
        Inte i = () -> System.out.println("Hello World!");
        i.abc();
    }
}
