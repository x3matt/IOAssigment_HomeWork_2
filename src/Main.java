import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws Exception{
		System.out.println(sortByLength("Words.txt"));
	}
	public static List<String> sortByLength(String fileName) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		return br.lines().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
	}
}
