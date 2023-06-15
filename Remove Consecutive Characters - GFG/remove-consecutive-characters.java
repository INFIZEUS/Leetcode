//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String str){
        int i = 0;
        int j = 0;
        String newStr = "";
        while (j < str.length()) {
            if(str.charAt(i) == str.charAt(j)){
                j++;
            } else if(str.charAt(j) != str.charAt(i) || j == str.length() - 1){
                newStr += str.charAt(i);
                i = j;
                j++;
            }
        }
        newStr += str.charAt(j - 1);
        return newStr;
    }
}