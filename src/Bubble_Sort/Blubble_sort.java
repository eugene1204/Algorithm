package Bubble_Sort;
/*
 * BigO, O(N*N)
 * 선택정렬보다 느리게 작동된다. 
 * 버블정렬은 계속해서자리를 바꾸는 연산을 함 
 * 컴퓨터가 수행해야하는.. 일이 많아 
 * 
 * i,j 반복문으로 끝에서부터 정렬함,i번째에 j로 두개씩비교해서 끝으로 보냄 
 * */
public class Blubble_sort {
	public static void main(String[] args) {
		int i, j, temp;
		int array[] = {10, 1, 5, 3, 2, 7, 8, 4, 6, 9};
		for(i =0; i < array.length; i++) {
			for(j =0;j < array.length -1 -i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			System.out.print(i+") ");
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
