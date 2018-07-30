
public class Factorial {
	public static void main (String args[]){
		int number=2;
		int fact=1;
		for(int i=1;i<=number;i++){
			fact=fact*i;    
		}
		System.out.println("Factorial of "+number+" is: "+fact);    
		
		int num = 16;
		String factors="";
		for(int i=1;i<=num/2;i++){
			if(num%i == 0){
				factors = factors+i+",";
			}
		}
			
		System.out.println("Factors of  "+num+" is: "+num+","+factors);
	}
	
	String [][] darr ={};
	
}
