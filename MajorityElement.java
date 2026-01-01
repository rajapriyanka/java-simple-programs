import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
            if (map.get(num) > n / 2) {
                System.out.println("Majority Element: " + num);
                return; // stop once found
            }
		}
		 System.out.println("No majority element");

	}

}
