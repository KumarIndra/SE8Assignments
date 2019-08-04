package guidedExercise1;

public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {281, 344, 265, 272, 236, 324, 287};
		int runs = 0;
		float average;
		int equal = 0;
		int above = 0;
		int below = 0;
		for(int x:score) {
			runs+=x;
		}
		average = runs/score.length;
		for(int y:score) {
			if(average==y) {
				equal++;
			}else if(y>average) {
				above++;
			}else {
				below++;
			}
		}
		System.out.println("Average score "+average+"\n"
		+"equal average match "+equal+"\nabove average match"+above
		+"\nBelow average match "+below);
	}

}
