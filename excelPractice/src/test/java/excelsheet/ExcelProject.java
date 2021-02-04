package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelProject {
	static WebDriver dr;
	static FileInputStream fis;
	static XSSFWorkbook xb;
	static XSSFSheet sheet;
	
	@Test	
	//@Parameters("url")
       public static void setup () throws IOException {
	   WebDriverManager.chromedriver().setup();
	   dr= new ChromeDriver();
	   dr.get("http://facebook.com");
	   dr.navigate().to("http://facebook.com");
	   dr.navigate().back();
	   dr.navigate().refresh();
	
//     // fis= new FileInputStream("C:\\Users\\Masud\\Documents\\testdata.xlsx");
//	  xb= new XSSFWorkbook(fis);
//	  sheet= xb.getSheet("masud");
//	  for (int i=0; i<sheet.getLastRowNum();i++) {
//		  String s=sheet.getRow(i).getCell(0).toString();
//		  String t=sheet.getRow(i).getCell(1).toString();
//		  System.out.println(s+ "  "+t);
//		
//	  }
//	  String exu = sheet.getRow(2).getCell(1).toString();
//	  System.out.println(exu);
	 
 }
 
// @Test
// public static void mainr() throws IOException {
//	setup();
//	

 
 
}
