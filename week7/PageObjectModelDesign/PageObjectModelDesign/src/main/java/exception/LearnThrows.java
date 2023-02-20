package exception;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnThrows {

	public void run() throws InterruptedException {
		Thread.sleep(1000);
	}
	public void print() {
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		LearnThrows obj=new LearnThrows();
		obj.run();
		obj.print();
		try {
			XSSFWorkbook wb=new XSSFWorkbook("./data");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
