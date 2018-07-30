import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class SwapNumbers {
	public static void main(String[] args){
		int a=1;
		int b=2;
		int c;
		a=a+b;
		b=a-b;
		a=a-b;
		double g = 23.3;
		int aw=(int) g;
		Set<String> testSet = new HashSet<String>();
		testSet.add("a");
		testSet.add("n");
		testSet.add("m");
		testSet.add("l");
		testSet.add("i");
		testSet.add("k");
		
		testSet.add("j");
		testSet.add("h");
		testSet.add("f");
		
		System.out.println(testSet);
		
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		testList.add("b");
		System.out.println(testList.toString());
		System.out.println(Integer.parseInt("1"));
		
		System.out.println(String.valueOf(21));
		System.out.println("a" + a);
		System.out.println("b"+ b);
		System.out.println("aw"+ aw);
		
		Map<String,String> gh = new TreeMap<String,String>();
	    Map<String, String> treemap = 
	    	      new TreeMap<String, String>();
	    treemap.put("a", "vv");
	    treemap.put("b", "vf");
	    treemap.put("c", "vd");
	    Set set = treemap.entrySet();
	    Iterator i = set.iterator();
	    // Display elements
	    while(i.hasNext()) {
	      Map.Entry me = (Map.Entry)i.next();
	      System.out.print(me.getKey() + ": ");
	      System.out.println(me.getValue());
	    }
		String str ="abc";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder = strBuilder.append(str).reverse();
		System.out.println(strBuilder);
		
		char [] strArr = str.toCharArray();
		int strLen = strArr.length;
		for(int j=strLen-1;j>=0;j--){
			System.out.println(strArr[j]);
			double d = 3.5;
			Long ad = Math.round(3.8);
			
			
			
			
			
			Object obj = null;
			Collections.singletonList(obj);
			
			
		}

		Stack ob = new Stack();
		ob.push(new Integer(1));
		ob.push(new Integer(2));
		ob.pop();
		ob.push(new Integer(3));
		
		ob.push(new Integer(4));
		Integer.valueOf("2");
		System.out.println("----"+ob);
		int array[] = new int [5];
		for (int o =5;o>0;o--){
			array[5-o]=o;
			Arrays.fill(array,1,4,8);
		}
			for (int h=0;h<5;h++){
				System.out.println("arrayFill--------"+array[h]);
				
			}
		
	}
}
