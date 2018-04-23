import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;

public class Filesize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fis = new File("D:\\Geetha\\library.txt");
		System.out.println(fis.length());
		System.out.println(LocalDateTime.now());

	}

}
