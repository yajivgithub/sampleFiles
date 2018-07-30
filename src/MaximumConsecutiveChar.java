
public class MaximumConsecutiveChar {
	public static void main(String args[]){
		String test = "aaaabbnnnmmmmm";
		char [] c = test.toCharArray();
		char temp = c[0];
		int count =0;
		int dynamicCount=1;
		int n =c.length;
		//0123
		//abcd
		for(int i=0;i<=n;i++){
		  if(i<n-1 && (c[i]==c[i+1])){
			  dynamicCount++;
		  }	else{
			  if(dynamicCount >count){
				  count = dynamicCount;
				  temp =c[i];
			  }
			  dynamicCount =1;
		  }
		}
		System.out.println(temp);
	}
}
