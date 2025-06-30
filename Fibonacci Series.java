class Main {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
        System.out.println("Enter a number of terms");
        int n=s.nextInt();
        int n1=0,n2=1,sum=0;
        System.out.println(n1+" "+n2);
        for(int i = 2;i<10;i++){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
      
    }
}
