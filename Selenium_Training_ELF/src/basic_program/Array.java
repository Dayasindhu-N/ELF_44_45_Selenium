package basic_program;

public class Array {
	public static void main(String[] args) {
		String s = "I am not a String";
		String[] s2 = s.split(" ");
		String s1 = "";
		for (int j = s.length() - 1; j >= 0; j--) {
			for (int i = 0; i < s2[i].length(); i++) {
				s1 += s.charAt(j);
			}
			System.out.print(" ");
		}
		System.out.println(s1);
	}
}
