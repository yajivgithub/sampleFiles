
public class PrimeNumber {
	public static void main(String[] args){
		
		
		
		for(int i=2; i<=100; i++){
			// check whether its factor of other numbers which is half of the number 
			//half the number
			
			if(isPrime(i)){
				System.out.println(i);
			};
			
			
			
		}
		
	}
	
	private static boolean isPrime(int n) {
	    for (int f = 2; f <= n/2; f++) {
	        if (isFactor(f, n))
	            return false;
	    }
	    return true;
	}

	private static boolean isFactor(int factor, int number) {
	    return number % factor == 0;
	}
}


