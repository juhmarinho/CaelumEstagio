/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Map<String,String> a = new HashMap<String,String>();
		a.put("-", "-");
		a.put("0", "0");
		a.put("1", "1");
		a.put("A", "2");
		a.put("B", "2");
		a.put("C", "2");
		a.put("D", "3");
		a.put("E", "3");
		a.put("F", "3");
		a.put("G", "4");
		a.put("H", "4");
		a.put("I", "4");
		a.put("J", "5");
		a.put("K", "5");
		a.put("L", "5");
		a.put("M", "6");
		a.put("N", "6");
		a.put("O", "6");
		a.put("P", "7");
		a.put("Q", "7");
		a.put("R", "7");
		a.put("S", "7");
		a.put("T", "8");
		a.put("U", "8");
		a.put("V", "8");
		a.put("W", "9");
		a.put("X", "9");
		a.put("Y", "9");
		a.put("Z", "9");
		
 
		ler(a);
        
         
    }
	
	public static void ler(Map<String, String> a) throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String numero = null;
		String linha = null;

	
		
		
		
	
		linha = sc.nextLine();
		
		for (int i = 0; i < linha.length(); i++) {
			
			if(numero == null)
				
				numero = linha.substring(i, i);
				System.out.print(a.get(linha.substring(i, i+1)));
		}
	}
}