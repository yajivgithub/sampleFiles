import java.util.Arrays;
import java.util.List;

public class FreshPractise {
public static void main(String[] args){

	int arr [] ={1,2,3,4,5,6,9,7,8,0};
		int x = 9;
		int index = 0;
		boolean present =false;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == x){
				index =i;
				present =true;
				break;
			} 
		}
		if(present){
			System.out.println(index);
		}else{
			System.out.println("not present");
		}
	}
}
