class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = s.nextInt();

        int count = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }

        if(count == 2) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }
}

