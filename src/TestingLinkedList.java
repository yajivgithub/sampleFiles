import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TestingLinkedList {
		public static void main (String args[]){
			LinkedList<String> linkString = new LinkedList<String>();
			linkString.add("a");
			linkString.add("e");
			linkString.add("b");
			linkString.add("c");
			
			
			TreeSet<String> treeString = new TreeSet<String>();
			treeString.add("a");
			treeString.add("e");
			treeString.add("b");
			treeString.add("c");
			System.out.println(linkString);
			System.out.println(treeString);
			
			StringTokenizer str = new StringTokenizer("I,am,ago,od,bo,y",",");
			int a = str.countTokens();
			String fir = str.nextToken();
			System.out.println(a);
			System.out.println(fir);
		}
}
