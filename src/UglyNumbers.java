
public class UglyNumbers {

	public static void main(String args []){
		//prime factors 2,3,5
		int input = 8;
		boolean flag =false;
		for(int i=2;i<=input/2;i++){
			if(input%i==0){
			flag=isUgly(i);
			if(!flag){
				break;
			}
			}
		}
		System.out.println("IS UGLY :"+flag);
	}
	private static boolean isUgly(int num){
		boolean isUgly = false;
		if(isPrime(num)){
		if(num == 2 || num == 3 || num == 5){
			isUgly= true;
		}else{
			isUgly= false;
		}
		}
		return isUgly;
	}
	
	private static boolean isPrime(int num){
		boolean isPrime =true;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isPrime= false;
			}else{
				isPrime= true;
			}
		}
		return isPrime;
	}
}
