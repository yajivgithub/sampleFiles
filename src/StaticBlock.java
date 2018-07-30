
public class StaticBlock {
static {
	System.out.println("Hi");
}
public static void main(String args[]){
	System.out.println("hello main");
	main(1);
}

public static void main(int a){
	System.out.println(a);
}
{
	System.out.println("hello empty");
}
}
