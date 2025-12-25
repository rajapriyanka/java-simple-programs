import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of persons
        int n = sc.nextInt();

        // ATM balance
        int k = sc.nextInt();

        // Withdrawal amounts
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Process each withdrawal
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                System.out.print(1 + " ");
                k -= arr[i];  // reduce ATM balance
            } else {
                System.out.print(0 + " ");
            }
        }

        sc.close();
    }
}
