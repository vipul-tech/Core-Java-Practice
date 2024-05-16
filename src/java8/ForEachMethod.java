package java8;

import java.util.*;

public class ForEachMethod{
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(11,22,33,44,55);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        list.forEach(x->System.out.print(x+" "));

        System.out.println();
        list.forEach(System.out::println);
    }
}
