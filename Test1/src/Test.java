import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Formatter;
import java.util.Scanner;

import org.xml.sax.InputSource;



public class Test {
  public static void main(String[] arg){
	  System.out.printf("abc %-15s %-6s","aaa","vvv");
	  System.out.println("");
	  try {
		Class<?> aaa = Class.forName("");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.format("s:%h ", 'g');
//	  new Formatter(System.out);
	  File file = new File("hex.class");
	  System.out.println(file.list());
	  
	  Scanner stdin = new Scanner(System.in);
	  System.out.println(stdin.nextLine());;
	  stdin = new Scanner(System.in);
	  System.out.println(stdin.nextLine());;
	  
	  
  }
  
  
  public static String format(byte[] data){
	  StringBuilder result = new StringBuilder();
	  
	  
	  
	  return  null;
  }
  
}
