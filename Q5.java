public class Q5{
	
	public static void main(String[] args){
		
		int a = 0, b = 0;
		int res1 = 0, res2 = 0;
		
		int add = add(a, b);
		int multiply = multiply(a, b);
		int square = square(a);
		
		res1 = square( add( multiply(3, 4) , multiply(5, 7) ) );
		res2 = add( square( add(4, 7) ) , square( add(8, 3) ) );
		
		
		System.out.println("result 1: " + res1);
		System.out.print("result 2: " + res2);
		
	}
	
	public static int add(int  a, int b){
		return a + b;
	}
	
	public static int multiply(int a, int b){
		return a * b;
	}
	
	public static int square(int a){
		return a * a;
	}
}