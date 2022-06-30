package Insertion_Sort;
// 필요할때만 연산함 
// O(N*N)
// 연산횟수가가장적어 

// 거의 정렬이 되어있으면 삽입정렬이 가장빨라 
// 왜냐면 왼쪽은정렬이 되어있기때문임 
public class Insert_sort {
	public static void main(String[] args) {
		int i, j,k, temp;
		int array[] = {10, 1, 5, 3, 2, 7, 8, 4, 6, 9};
		
		for (i=0; i<array.length -1; i++) {
			j=i;
			while(array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
				
				if(j<0) {break;}
			}
			System.out.println("");
			for(k =0; k<10;k++) {
				System.out.print(array[k]+" ");}
		}
		System.out.println("");
		for(i =0; i<10;i++) {
			System.out.print(array[i]+" ");}
		
	}

}
