package home;
import java.lang.Math;
public class Convertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "-23";
		int ascii;
		char lit;
		int number= 0;
		int nr = 0;
		int lung;
		boolean negativ = false;
		System.out.println("String: "+word);
		lung = word.length();
		
		ascii = (int)word.charAt(0);
		if(ascii == 45)
		{
			negativ = true;
		}
		
		
		for(int i=0; i<word.length();i++)
		{
			
			if(negativ==true && i!=word.length()-1)
				i=i+1;
			lit = word.charAt(i);
			ascii = (int) lit;
			
			
			
			if (ascii>47 && ascii<58)
			{
				number = number + (int) ((ascii-48) * Math.pow(10,lung-1-i));
		
			}
			/*
			else if (ascii == 46)
			{
				System.out.print(".");
			}*/
			if (negativ == true)
				nr = 0-number;
		}
		System.out.print("Number: "+nr);
		
	}

}
