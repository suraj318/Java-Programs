package Coding;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortAndJoin {
	public static void main(String[] args) {
		
		String names="qweer,sdav,asc,asq,eth,sf,gasc,qw";
		System.out.println(names);
		
		String[] split= names.split(",");
		Arrays.sort(split);
		String join = String.join("", split);
		System.out.println(join);
		
		List<String> list = Arrays.stream(split).filter(a->a.startsWith("a")).collect(Collectors.toList());
		System.out.println(list);
	}
	

}
