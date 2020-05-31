import java.io.File;
import java.util.Arrays;

public class SHFA {

	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("param required");
			return;
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists())
		{
			System.out.println("Does not exist");
			return;
		}
		
		if(!dir.isDirectory())
		{
			System.out.println("Is not a dir");
			return;
		}
		
		File[] sub = dir.listFiles();
		
		Arrays.sort(sub);
		
		for(File f : sub)
		{
			System.out.println(f.getAbsolutePath());
		}
	}

}
