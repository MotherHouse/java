package 数组;

public class ArrayDemo01 {

	public static void main(String[] args) {
		int[] score = null;
		score = new int[3];
		
		for (int i=0;i<score.length;i++) {
			score[i] = i*2+1;
		}

		for (int i=0;i<score.length;i++) {
			System.out.println(score[i]);
			
		}
	}

}
