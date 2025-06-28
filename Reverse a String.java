class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String n = s.nextLine();
        
        StringBuilder sb = new StringBuilder(n);
        StringBuilder rev = sb.reverse();
        
        System.out.println(rev);
    }
}
