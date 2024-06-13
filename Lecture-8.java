package corejava;

public class loop4 {
	public static void main (String[] args) {
		
		
		int i =1;               ////FOR LOOP////
		
		for(i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		System.out.println("I is : " +i);

		
		int  g= 5;
		while(g>0)   ///WHILE LOOP///
		{
			System.out.println("Hello");
			g--;
		}
		System.out.println("After while loop g is: " +g);
		
		
		              
		                 
		                  ////DO-WHILE LOOP////
		int r =10;
		do {
			System.out.println(r);
			r--;
			
		}
		while(r>0);
		System.out.println("After do while loop r is: " +r);

	}
}
