import java.util.*;
public class diamondPattern {
public static void main(String args[]) {
	int num , m ,n;
	System.out.print("Enter No of Rows:");
	Scanner s = new Scanner(System.in);
	num = s.nextInt();
	for(m=1;m<=num;m++) {
		for(n=1;n<=num-m;n++) {
			System.out.print(" ");
		}
		for(n=1;n<=m*2-1;n++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(m=num-1;m>0;m--) {
		for(n=1;n<=num-m;n++) {
			System.out.print(" ");
		}
		for(n=1;n<=m*2-1;n++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
