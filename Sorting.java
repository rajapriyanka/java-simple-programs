<<<<<<< HEAD
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        if(n<3) return 0;
        
        int left = 0, right = n-1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;
        
        while(left<=right){
            if (arr[left] <= arr[right]){
                if(arr[left]>=leftMax){
                leftMax = arr[left];
            }else{
                totalWater +=leftMax - arr[left];
            }
            left++;
        }else{
            if (arr[right] >= rightMax){
                rightMax = arr[right];
            }else{
                totalWater +=rightMax - arr[right];
            }
            right--;
        }
    }

    return totalWater;
}
}
=======
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        if(n<3) return 0;
        
        int left = 0, right = n-1;
        int leftMax = 0, rightMax = 0;
        int totalWater = 0;
        
        while(left<=right){
            if (arr[left] <= arr[right]){
                if(arr[left]>=leftMax){
                leftMax = arr[left];
            }else{
                totalWater +=leftMax - arr[left];
            }
            left++;
        }else{
            if (arr[right] >= rightMax){
                rightMax = arr[right];
            }else{
                totalWater +=rightMax - arr[right];
            }
            right--;
        }
    }

    return totalWater;
}
}
>>>>>>> b1a1acfefc6f3d8940a694b346bf7108c13daccb
