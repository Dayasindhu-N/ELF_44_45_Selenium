package basic_program;

class Calculator{
	public double add(double...ds) {
		double sum = 0;
		for (double d : ds) {
			sum+=d;
		}
		return sum;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
}

public class VarArgs {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		double res = c.add(65,98,29,65,54,5,54,84,7,98,161,651,1348,548,881);
		System.out.println(res);
	}
}