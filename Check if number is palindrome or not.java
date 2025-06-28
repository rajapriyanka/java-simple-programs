class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        StringBuilder rev= sb.reverse();
        int reversedNum = Integer.parseInt(rev.toString());
        if(n==reversedNum){
            System.out.println("It is palindrome number");
        }
        else{
            System.out.println("It is not palindrome number");
        }
        
    }
}
