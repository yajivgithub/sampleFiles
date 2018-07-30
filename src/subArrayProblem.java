
public class subArrayProblem {
	public static void main(String[] args) 
    {
    
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
    }
	
	    /* Returns true if the there is a subarray of arr[] with sum equal to
	       'sum' otherwise returns false.  Also, prints the result */
	private static void subArraySum(int arr[], int arrayLength, int sum) 
	{
	int i =0;
	int currSum=0;
		for(i=0;i<arrayLength;i++){
			currSum = arr[i];
			for(int j=i+1;j<=arrayLength;j++){
				if(currSum == sum){
					System.out.println("index between" +i +"and" +(j-1));
				}
				if(currSum > sum || j == arrayLength){
					break;
				} 
				currSum = currSum + arr[j]; 
			}
		}


	}    
	}
	 
/*
*/