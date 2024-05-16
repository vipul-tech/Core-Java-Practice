package java8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args){
        Integer i1 = null;
        Integer i2 = 90;

        Optional<Integer> o1 = Optional.ofNullable(i1);
        Optional<Integer> o2 = Optional.ofNullable(i2);

        add(o1, o2);
    }

    public static void add(Optional<Integer> a, Optional<Integer> b){
        Integer x = a.orElse(new Integer(0));
        Integer y = b.orElse(new Integer(0));
        System.out.println(x+y);
    }
}
