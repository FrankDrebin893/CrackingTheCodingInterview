package randomExercises;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("!dlrow olleH"));
		
		System.out.println("Multiplication table:");
		int i = 1;
		int multiplicationNumber = 3;
		int multiplicationValue = i*multiplicationNumber;
		
		while(isBiggerThan(33, multiplicationValue)) {
			System.out.println(i + " * " + multiplicationNumber + " = " + i*multiplicationNumber);
			multiplicationValue = i*multiplicationNumber;
			i++;
		}
	}
	
	public static String reverseString(String string) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = string.length()-1; i >= 0; i--) {
			sb.append(string.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static boolean isBiggerThan(int a, int b) {
		if(a <= b)		return false;
		return true;
	}

}
