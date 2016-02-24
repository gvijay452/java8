package java8.practice;

import java.util.Arrays;
import java.util.List;

/**
 * My 1st Java 8 Program
 * 
 * @author Vijayakumar G
 *
 */
public class Java8Program {

	public static void main(String[] args) {
		List<String> java8Features = Arrays
				.asList(new String[] { "Lambda Expression", "Data API", "Stream API", "Effectively Final" });
		List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 3, 4 });
		java8Features.forEach((n) -> System.out.println(n));
		java8Features.stream().forEach(System.out::println);
		Runnable runnable = () -> {
			System.out.println("Test Runnable in Java 8");
		};
		new Thread(runnable).start();
		java8Features.parallelStream().forEach(System.out::println);
		java8Features.parallelStream().forEachOrdered(System.out::println);
		java8Features.stream().filter((s) -> s.contains("API")).forEach((s) -> {
			System.out.println(s);
		});
		numbers.stream().forEach((n) -> {
			System.out.println(n);
			n++;
			System.out.println(n);
		});
	}
}
