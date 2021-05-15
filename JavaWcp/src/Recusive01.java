
public class Recusive01 {
	public static void main(String[] args) {
		int number = 1;
		printNum(number);
	}
	public static void printNum(int number) {
		if (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
			printNum(number);
		}
	}
}
