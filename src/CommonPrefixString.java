
public class CommonPrefixString {
	public static void main (String args[]){
	// geeksforfh,geeksdi,geein,geeo
		
		String [] strArr = {"geesforfh","geeksfdi","geeksfin","geeksfo"};
		
			String initialString = strArr[0];
			String tempString = "";
			int count =0;
			char [] initialStringChar = initialString.toCharArray();
			for(int i=0;i<initialStringChar.length;i++){
				count =1;
				for(int j=1; j<strArr.length; j++){
					if(i<=strArr[j].length()-1 && initialStringChar[i] == strArr[j].charAt(i)){
						count ++;
						if(count ==strArr.length){
							tempString = tempString + initialStringChar[i];
							break;
						}
					}
					
					
					/*if(j<=strArr[i].length() && strChar[j] == strArr[i].charAt(j)){
						tempString.append(strChar[j]);
						break;
					}*/
				}
			}
		
		System.out.println(tempString);
	}
}
