package main;
import java.util.Scanner;

public class MoveAllZeros {
	public static void zeros(int arr[]) {
		int index =0;
		int result[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				result[index++]=arr[i];
			}
		}
		for(int num:result) {
			System.out.print(num+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i]= sc.nextInt();
		}
		zeros(arr);
		
	}

}
