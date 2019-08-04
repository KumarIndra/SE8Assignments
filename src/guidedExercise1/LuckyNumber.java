package guidedExercise1;

public class LuckyNumber {
  public static void main(String[] args) {
	int input = 1523;
	int square = 0;
	int output = 0;
	String value = Integer.toString(input);
	String[] array = value.split("");
	for(int i = 1;i<=array.length;i=i+2) {
		int temp = Integer.parseInt(array[i]);
		square  = temp * temp;
		output+=square;
	}
	if(output%9==0) {
		System.out.println(output);
	}else {
		System.out.println(output+" Oops! Not a Lucky number");
	}
	
}
}
