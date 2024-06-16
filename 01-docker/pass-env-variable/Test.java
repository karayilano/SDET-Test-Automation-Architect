public class Test{
	public static void main(String[] args){
		System.out.println("Received # i is " + args[0]);
		int number = Integer.parseInt(args[0]);

		//Find squares
		for(int i=1; i <= number; i++){
			System.out.println("Square of " + i + " is =>" + (i*i));
		}
	}
}