package Main;

public class FibonacciSequence {
	
	public static int numberX = 0;
	public static int numberY = 1;
	public static int numberZ;

	
	public static void FibonacciNumbers() {
	
		for(int i = 2; i < 20; i++) {
			
			
			numberZ = numberX+numberY;
			
			System.out.print(" " + numberZ);
			
			numberX = numberY;
			numberY = numberZ;
		}

	}
	
	
	public static void main(String[] args) {
			
			System.out.print(numberX +" "+ numberY);
			FibonacciNumbers();
			
		}
	

}
