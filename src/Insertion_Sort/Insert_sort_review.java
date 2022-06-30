package Insertion_Sort;

public class Insert_sort_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,k, temp;
		int array[] = {10, 1, 5, 3, 2, 7, 8, 4, 6, 9};
		
		for(i=0; i<array.length-1; i++) {
			j=i;
			while(array[j]>array[j+1]) {
				temp =array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				j--;
				if(j<0) {break;}
			}
		}
	}

}
