package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI2 {

	public static void main(String[] args) {
		OptionalInt reduced = IntStream.range(1, 11).reduce((x,y)->x+y);
		System.out.println(reduced.getAsInt());
		
		int reduced2Param = IntStream.rangeClosed(1, 10).reduce(10, (a,b)->a+b);
		System.out.println(reduced2Param);
		
		int reduced2Param1 = Stream.of(1, 2, 3, 4).reduce(10, (a,b)->a+b, (a,b)->a+b);
		System.out.println(reduced2Param1);
		
		int reduced2Param2 = Arrays.asList(1, 2, 3, 4).parallelStream().reduce(10, (a,b)->a+b, (a,b)->a+b);
		System.out.println(reduced2Param2);
		
		IntSummaryStatistics stats = IntStream.range(1, 10).summaryStatistics();
		System.out.println(stats);
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		System.out.println(stats.getClass());
	}

}
