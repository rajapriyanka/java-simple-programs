class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Enter element to search:");
        int key = s.nextInt();

        Arrays.sort(a); 

        int result = binarySearch(a, key);

        if (result == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found at index: " + result);
        }
    }
   public static int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Not found
    }
}
