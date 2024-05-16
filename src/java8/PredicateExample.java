package java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){
        int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        Predicate<Integer> p1 = x->(x%2)==0;
        Predicate<Integer> p2 = x->x>50;

        getResult(p1, arr);
        getResult(p1.negate(), arr);
        getResult(p2, arr);
        getResult(p1.negate().and(p2), arr);
        getResult(p1.or(p2.negate()), arr);
    }

    public static void getResult(Predicate<Integer> p, int[] arr){
        for(int i : arr){
            if(p.test(i))
                System.out.println(i);
        }
        System.out.println("-----------");
    }
}
