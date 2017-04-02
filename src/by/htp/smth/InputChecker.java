package by.htp.smth;

import java.io.InputStreamReader;
import java.util.Scanner;

public class InputChecker {
	
	public int validCheck(String input) {

		if (input.matches("\\d++")) {
			return 0;
		} else {
			return 1;
		}
	}

	public String input() {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String one = sc.next();
		return one;
	}

}
