package src;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Long> bag =
		        Arrays.asList("one o'clock two o'clock three o'clock rock".split(" "))
		        .stream()
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.print("");
	}

}
