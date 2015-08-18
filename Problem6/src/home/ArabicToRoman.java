package home;

public class ArabicToRoman {
	
	public static void convertion(int number)
	{
		String roman= "";
		while (number >= 1000) {
	        roman = roman + "M";
	        
	        number -= 1000;        
	    }
	    while (number >= 900) {
	        roman = roman + "CM";

	        number -= 900;
	    }
	    while (number >= 500) {
	        roman = roman + "D";

	        number -= 500;
	    }
	    while (number >= 400) {
	        roman = roman + "CD";

	        number -= 400;
	    }
	    while (number >= 100) {
	        roman = roman + "C";

	        number -= 100;
	    }
	    while (number >= 90) {
	        roman = roman + "XC";

	        number -= 90;
	    }
	    while (number >= 50) {
	        roman = roman + "L";

	        number -= 50;
	    }
	    while (number >= 40) {
	        roman = roman + "XL";

	        number -= 40;
	    }
	    while (number >= 10) {
	        roman = roman + "X";

	        number -= 10;
	    }
	    while (number >= 9) {
	        roman = roman + "IX";

	        number -= 9;
	    }
	    while (number >= 5) {
	        roman = roman + "V";

	        number -= 5;
	    }
	    while (number >= 4) {
	        roman = roman + "IV";

	        number -= 4;
	    }
	    while (number >= 1) {
	        roman = roman + "I";

	        number -= 1;
	    }    
		
		System.out.println(roman);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertion(3458);
	}
}
