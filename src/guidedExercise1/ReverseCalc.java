package guidedExercise1;

public class ReverseCalc {
	public static void main(String[] args) {
		String input = "2758";
		int rem = 0;
		String output ="";
		int value = Integer.parseInt(input);
		for(int i = 0; i<input.length();i++) {
			rem = value % 10;
			value = value / 10;
			output +=rem;
		}
		System.out.println(output);
	}
}
