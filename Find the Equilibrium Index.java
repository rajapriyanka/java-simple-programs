import java.util.Scanner;
public class EquilibriumIndex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int totalSum =0;
		for(int num : arr) {
		  totalSum += num;
		}
		int leftSum=0;
		for(int i=0;i<n;i++) {
			totalSum -= arr[i];
			if(leftSum ==totalSum) {
				System.out.println("Equilibirum index found at "+i);
				return;
			}
			leftSum+=arr[i];
		}
		System.out.println("No equilibirum index found");
	}

}
