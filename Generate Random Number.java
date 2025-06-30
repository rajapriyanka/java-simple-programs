import java.util.Random;
class Main {
    public static void main(String[] args) {
       Random rand = new Random();
       int digit = 100000 + rand.nextInt(900000);
       System.out.println(digit);
    }
}
