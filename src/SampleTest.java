import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.Map.Entry;






public class SampleTest implements Comparable<SampleTest> {
	
	static int MAX_CHAR = 26;
	public static void main(String[] args){
		
		int number = 5;
		for(int i=1;i<=number; i++){
			StringBuilder str = new StringBuilder();
			for(int j=1;j<=i;j++){
				int d = number-j;
				for(int a=1;a<=d;a++){
					System.out.print(" ");	
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*String demo = "cats";
		String pattern = "atsc";
		boolean a= isRotation(demo,pattern);		
		System.out.println(a);
		
		String longest = "hi i am a good boydsd";
		int length = LongestWordLength(longest);
		System.out.println(length);
		
		int totalSec = 238947492;
		//1 hr 3600 sec 
		//24 hr 24*3600 86400
		int days = totalSec/86400;
		int hrs = (totalSec%86400)/3600;
		
		int sec = ((totalSec%86400)%3600);
		
		  String gk = "abcvhjdfgbbc";
		  testCorner(gk);
		  String corner = "geeks";
		  String firstStr ="abcdefgh";
		  String testString = "eflo";
		  
		  int firstLength = firstStr.length();
		  int testStringLen = testString.length();
		  twoStrings(firstStr,testString);
		 
*/				
	}
	

	static String testCorner(String gk){
      
        String corner = "abc";

        int gkLn=gk.length();
        int crnLn=corner.length();
        if(gkLn < crnLn){
            String result = "not present";
        }else{
            if(gk.substring(0,crnLn).compareTo(corner)==0 && gk.substring((gkLn-crnLn),gkLn).compareTo(corner)==0){
            	System.out.println("true");
            };
        }
        return "";
    }
    
	
	 static boolean twoStrings(String s1, String s2) 
	    {
	        // vector for storing character occurrences
	        boolean v[]=new boolean[MAX_CHAR];
	        Arrays.fill(v,false);
	     
	        // increment vector index for every
	        // character of str1
	        for (int i = 0; i < s1.length(); i++)
	            v[s1.charAt(i) - 'a'] = true;
	         
	        // checking common substring of str2 in str1
	        for (int i = 0; i < s2.length(); i++) 
	            if (v[s2.charAt(i) - 'a']) 
	            return true;
	         
	        return false;     
	    }
	 
	 
	static int LongestWordLength(String str)
    {
       int n = str.length();
       int res = 0, curr_len = 0;
       for (int i=0; i<n; i++)
       {
          // If current character is not
          // end of current word.
          if (str.charAt(i) != ' ')
             curr_len++;
 
          // If end of word is found
          else
          {
             res = Math.max(res, curr_len);
             curr_len = 0;
          }
       }
 
       // We do max one more time to consider
       // last word as there won't be any space
       // after last word.
       return Math.max(res, curr_len);
    }
 
	
	private static boolean isRotation(String s1,String s2) {
		boolean one =s1.length() == s2.length();
		String add = s1+s1;
		boolean two = add.indexOf(s2) != -1;
		
	    return one && two;
	}
	
	
	private static int[] addElement(int[] a, int e) {
	    a  = Arrays.copyOf(a, a.length + 1);
	    a[a.length - 1] = e;
	    return a;
	}
	 private static long fibonacci(int n) {
	        if (n <= 1) return n;
	        else return fibonacci(n-1) + fibonacci(n-2);
	    }
	private static void setbool(boolean value){
		value= true;
	}


	    //System.out.println();
	

	@Override
	public int compareTo(SampleTest arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static boolean areElementsContiguous(int arr[],
            int n)
			{
			// Sort the array
			Arrays.sort(arr);
			
			// After sorting, check if 
			// current element is either
			// same as previous or is 
			// one more.
			for (int i=1; i<n; i++)
			if (arr[i] - arr[i-1] > 1)
			return false;
			
			return true;    
			}
}

