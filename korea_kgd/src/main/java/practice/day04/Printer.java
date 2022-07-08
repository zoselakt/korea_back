package practice.day04;

public class Printer {
	static void println(int num) {
		System.out.println(num);
	}
	static void println(boolean truefalse) {
		System.out.println(truefalse);
	}
	static void println(double silsu) {
		System.out.println(silsu);
	}
	static void println(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		 Printer.println(true);
		 Printer.println(5);
		 Printer.println(5.5);
		 Printer.println("5.5");
	}
}
