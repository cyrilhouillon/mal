package step0;

public class REPL {

	private String READ(String input) {
		return input;
	}

	private String EVAL(String input) {
		return input;
	}

	private String PRINT(String input) {
		return input;
	}
	
	public String rep(String input) {
		return PRINT(EVAL(READ(input)));
	}
}
