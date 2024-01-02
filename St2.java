// // GFG Problems 


// // 1.) Subarray with given sum


import java.util.ArrayList;

class St2
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start = 0 , last = 0 , currSum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int end=0; end<n; end++){
             currSum += arr[end];
             if(currSum>=s){
                 last = end;
                 while(s < currSum && start < last){
                     currSum -= arr[start];
                     start++;
                 }
                 if(currSum == s){
                     res.add(start + 1);
                     res.add(end +1);
                     return res;
                 }
             }
             
        }
         if (res.isEmpty()) {
            res.add(-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;  
        ArrayList<Integer> res = subarraySum(arr, n, s);
        System.out.println(res);
    }
}

//2.) Rat in a Maze Problem - I

// Input:
// N = 4
// m[][] = {{1, 0, 0, 0},
//          {1, 1, 0, 1}, 
//          {1, 1, 0, 0},
//          {0, 1, 1, 1}}
// Output:
// DDRDRR DRDDRR
// Explanation:
// The rat can reach the destination at 
// (3, 3) from (0, 0) by two paths - DRDDRR 
// and DDRDRR, when printed in sorted order 
// we get DDRDRR DRDDRR.

// import java.util.*;
// import java.io.*;

// class Solution {
//     public static ArrayList<String> findPath(int[][] m, int n) {
//         // Your code here\
//         ArrayList<String> res = new ArrayList<>();
//         if(m[0][0] == 0 || m[n-1][n-1] == 0){
//             return res;
//         }
//         boolean[][] visited = new boolean[n][n];
//         String path = "";
//         findPathUtil(m, n, 0, 0, visited, path, res);
//         return res;

//     }

//     public static void findPathUtil(int[][] m, int n, int i, int j, boolean[][] visited, String path, ArrayList<String> res){
//         if(i < 0 || i >= n || j < 0 || j >= n || visited[i][j] || m[i][j] == 0){
//             return;
//         }
//         if(i == n-1 && j == n-1){
//             res.add(path);
//             return;
//         }
//         visited[i][j] = true;
//         findPathUtil(m, n, i-1, j, visited, path + "U", res);
//         findPathUtil(m, n, i+1, j, visited, path + "D", res);
//         findPathUtil(m, n, i, j-1, visited, path + "L", res);
//         findPathUtil(m, n, i, j+1, visited, path + "R", res);
//         visited[i][j] = false;
//     }

//     public static void main(String[] args) {
//         int[][] m = {{1, 0, 0, 0},
//                      {1, 1, 0, 1}, 
//                      {1, 1, 0, 0},
//                      {0, 1, 1, 1}};
//         int n = m.length;
//         ArrayList<String> res = findPath(m, n);
//         System.out.println(res);
//     }
    
// }