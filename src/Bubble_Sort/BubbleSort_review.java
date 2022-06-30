package Bubble_Sort;

public class BubbleSort_review {
	public static void main(String[] args) {
		int i, j, temp;
		int array[] = {1, 10, 5, 3, 2, 7, 8, 4, 6, 9};
		for(i=0; i < array.length; i++) {
			for(j=0; j< array.length -1 -i;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp; 
				}
				
				
			}
			
		}
		System.out.println("");
		for(i =0; i<10;i++) {
			System.out.print(array[i]+" ");}
	}

}
