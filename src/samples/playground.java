package samples;

import java.util.Arrays;
import java.util.Scanner;

public class playground {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("rotaion: ");
		int rotation = s.nextInt();
		s.nextLine();
		System.out.println("size");
		String size = s.nextLine();
		String matrixsize[] = size.split(",");
		int[][] input = new int[Integer.parseInt(matrixsize[0])][Integer.parseInt(matrixsize[1])];
		System.out.println("matrix index 1");
		String index1 = s.nextLine();
		String index[] = index1.split(",");
		int matrix[] = new int[index.length];
		for(int i=0;i<=index.length-1;i++) {
			matrix[i] = Integer.parseInt(index[i]);
		}
		
	}

}
