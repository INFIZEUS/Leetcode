//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	void  select(int arr[], int i)
	{
        for (i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;

            int maxIndex = getMaxindex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        
	}
	
	static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxindex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
	
	
	void selectionSort(int arr[], int n)
	{
	    select(arr, 0);
	}
}