package Selection_Sort;

public class Selection_review {
	public static void main(String[] args) {
		int i, j, temp, index=0;
		
		int array[] = {10, 1, 5, 3, 2, 7, 8, 4, 6, 9};
		
		for(i=0; i<array.length; i++) {
			int min = 999;
			for(j=i; j < array.length; j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
				
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			
		}
		System.out.println("");
		for(i =0; i<10;i++) {
			System.out.print(array[i]+" ");}
	}
}
