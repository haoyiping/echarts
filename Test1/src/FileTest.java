import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.regex.Pattern;


public class FileTest {
	public static void main(String[] arg){
		File file = new File(".\\bin");
		for(String a:file.list(/*new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return Pattern.compile("").matcher(name).matches();
			}
		}*/))
		System.out.println(file.getAbsolutePath()+a);
	}
}
 class Redirecting{
	public static void main(String[] arg) throws IOException{
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(".\\bin\\aaa.txt"));
		System.setIn(in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		
		BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(".\\bin\\bbb.txt"));
		PrintStream out = new PrintStream(buffer);
		PrintStream consol = System.out;
		
		System.setOut(out);
		String s= br.readLine();
		consol.print(s);
		System.out.print(s);
		out.close();
	}
}