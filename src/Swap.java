
public class Swap {

	public static void main(String[] args) 
	{
		 int x = 5;
	        int y = 10;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	         
	        x = x+y;  //add both the numbers and assign it to first
	        y=x-y;    //subtract both the numbers and assign it to second
	        x=x-y;    //subtract both the numbers and assign it to first
	        
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
		

	}

}
