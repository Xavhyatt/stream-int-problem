
import java.util.Arrays;

public class Streamer {
	public void convert(Integer[] intArray) {
		Arrays.asList(intArray)
		.stream()
		.map(i -> test(i))
		.map(word -> word.substring(0, 1).toUpperCase()+word.substring(1))
		.sorted()
		.forEach(System.out::println);
	}
	
	public String test(Integer i) {
		String num="";
		if(i==100) return "Onehundred";
		if(i<10 || i>19) {
			switch(i/10) {
			case 2: num+="Twenty";
			break;
			case 3: num+="Thirty";
			break;
			case 4: num+="Forty";
			break;
			case 5: num+="Fifty";
			break;
			case 6: num+="Sixty";
			break;
			case 7: num+="Seventy";
			break;
			case 8: num+="Eighty";
			break;
			case 9: num+="Ninety";
			break;
			}
			switch(i%10) {
			case 1: num+= "one";
			break;
			case 2: num+="two";
			break;
			case 3: num+="three";
			break;
			case 4: num+="four";
			break;
			case 5: num+="five";
			break;
			case 6: num+="six";
			break;
			case 7: num+="seven";
			break;
			case 8: num+="eight";
			break;
			case 9: num+="nine";
			break;
			}
		} 
		if(i<20) {
			switch(i) {
			case 0: num+= "Zero";
			break;
			case 10: num+="Ten";
			break;
			case 11: num+= "Eleven";
			break;
			case 12: num+="Twelve";
			break;
			case 13: num+="Thirteen";
			break;
			case 14: num+="Fourteen";
			break;
			case 15: num+="Fifteen";
			break;
			case 16: num+="Sixteen";
			break;
			case 17: num+="Seventeen";
			break;
			case 18: num+="Eighteen";
			break;
			case 19: num+="Nineteen";
			break;
			}
		}
		return num;
	}
}
