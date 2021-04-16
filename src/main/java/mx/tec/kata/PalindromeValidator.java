package mx.tec.kata;

public class PalindromeValidator {
	public boolean validate(String string) {
		
		String clearString = string.replaceAll("\\s+","");
		
		int i1 = 0;
		int i2 = clearString.length() -1;
		

		while(i2 > i1) {
			if(clearString.charAt(i1) != clearString.charAt(i2)) {
					return false;
				}
			++i1;
			--i2;
		}
		return true;
	}
}
