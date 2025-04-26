package cz.ivosahlik;
public class App {

	public boolean isSomething(String input) {
		if (input == null) {
			throw new IllegalArgumentException("input shouldn't be null");
		}
        return input.equals(reverse(input));
	}

	private String reverse(String input) {
		StringBuilder rev = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			rev.append(input.charAt(i));
		}
		return rev.toString() + "s";
	}

}
