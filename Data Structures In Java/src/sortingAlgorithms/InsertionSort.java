package sortingAlgorithms;

public class InsertionSort {

	public void sort(int[] input) {

		for (int i = 1; i < input.length; i++) {
			int key = input[i];
			int j = i - 1;
			while (j > 0 && input[j] > key) {
				input[j + 1] = input[j];
				j = j - 1;
			}
			input[j+1] = key;
			
		}

	}

	public static void main(String[] args) {
		int [] input= {1,3,9,4,2,10};
		InsertionSort ins=new InsertionSort();
		ins.sort(input);
		
		for (int k : input) {
			System.out.print(k + " ");
		}
	}

}
