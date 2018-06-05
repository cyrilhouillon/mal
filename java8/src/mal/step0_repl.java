package mal;

import java.util.Scanner;

import step0.REPL;

public class step0_repl {
	public static void main(String[] args) {
		REPL repl = new REPL();
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("user> ");
				String input = sc.nextLine();
				String result = repl.rep(input);
				System.out.println(result);
			} catch (Exception e) {
				break;
			}
		}
	}
}
