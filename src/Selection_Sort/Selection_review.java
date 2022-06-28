package Selection_Sort;

public class Selection_review {
	public static void main(String[] args) {
		int i, j, temp, index=0;
		
		int array[] = {1, 3, 5, 7, 9, 10, 2,4, 6,8};
		
		for(i = 0; i < array.length; i++ ) {
			int min = 9999;
			
			for(j = i; j < array.length; j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
					
				}
				
			}
			temp = array[i];
			array[i]= min;
			array[index] = temp;
			
		}
		
		System.out.println("");
		for(i =0; i<10;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
