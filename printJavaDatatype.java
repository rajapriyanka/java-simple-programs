import java.util.Scanner;

public class printJavaDatatype {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt(); // Number of test cases
        for(int i = 0; i < tc; i++) { 
            try {
                long a = s.nextLong();
                System.out.println(a + " can be fitted in:");
                
                if(a >= Byte.MIN_VALUE && a <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if(a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if(a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
                
            } catch (Exception e) {
                System.out.println(s.next() + " can't be fitted anywhere.");
            }
        }
        s.close();
    }
}
