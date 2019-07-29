import java.io.File;
import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello world  "+i);
		}
		System.out.println("changes made " +new Date().getTime());
		System.out.println(new File(".").getAbsolutePath());
		

	}

}
