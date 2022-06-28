package Selection_Sort;
/*
 * BigO, O(N*N)
 * */
public class Select_sort {
	public static void main(String[] args) {
		int i, j, min, index = 0, temp; 
		int array[]= {1, 10, 4, 8, 7, 6,5,3,2,9};
		for(i=0; i<array.length; i++) {
			min = 9999;
			for(j= i; j < array.length ; j++) {
				if(min > array[j]) { //현재 탐색하고 있는 숫자가 최소값보다 작다면 최소값 재설정 
					min = array[j];
					index = j;
					
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			
			for(int k =0; k<10;k++) {
				System.out.print(array[k]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		for(i =0; i<10;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
