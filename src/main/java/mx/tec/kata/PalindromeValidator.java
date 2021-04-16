package mx.tec.kata;

public class PalindromeValidator {
	public boolean validate(String string) {
		
		int i1 = 0;
		int i2 = string.length() -1;
		
		while(i2 > i1) {
			if(string.charAt(i1) != string.charAt(i2)) {
					return false;
				}
			++i1;
			--i2;
		}
		return true;
	}
}
