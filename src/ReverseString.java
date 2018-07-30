import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {
 public static void main (String args[]){
	 String str = "vijay123";
	 String hex = "6765656b73";
	 String ascii = "";
	 char [] hexArr =hex.toCharArray();
	 for(int h=0;h<hexArr.length;h += 2){
		 String part = hex.substring(h, h + 2);
		 
         // change it into base 16 and typecast as the character
         char ch = (char)Integer.parseInt(part, 16);
         ascii = ascii+ch;
	 }
	 String replace = "Vijay is a good boy ";
	 Pattern patt = Pattern.compile("[\\s]");
	 
     // Searching patt in s.
     Matcher mat = patt.matcher(replace);
     System.out.println(mat.find(2));
     
	 System.out.println(str.hashCode());
	 System.out.println(ascii);
	 char [] strArray = str.toCharArray();
	 
	 for(int i=strArray.length-1;i>=0;i--){
		 System.out.println(strArray[i]);
	 }
	 
	 String inputString ="DIG%GfID";
	 StringBuilder inputSt = new StringBuilder(inputString);
	 if(inputString.equals(inputSt.reverse().toString())){
		 System.out.println("Yes Palindrome");
	 }else{
		 System.out.println(inputSt.reverse().toString());
		 System.out.println("No Palindrome");
	 }
 }
}
