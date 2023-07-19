package baseLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.javafaker.Faker;

public class UtilityClassbase 
{
	public static void writeExcel() throws IOException
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet wbsheet =workbook.createSheet();
		XSSFRow row ;
		XSSFCell cell;
		Faker fake = new Faker();
		Map<String, Object[]> studentData
        = new TreeMap<String, Object[]>();
        studentData.put("1", new Object[]{"name", "age", "city", "email", "phones"});
		for(int i=2;i<21;i++)
		{
			studentData.put(i+"", new Object[]{fake.name().fullName(),fake.number().numberBetween(12, 50),
					fake.address().cityName(),fake.internet().emailAddress(),fake.number().randomNumber(10, false)+""});
		}
//		System.out.println("student data "+studentData);
		Set<String> keyid = studentData.keySet();
//		System.out.println("key id "+keyid.toString());
		int rownum=0;
		for(String key:keyid)
		{
//			System.out.println("key "+  key );
			row=wbsheet.createRow(rownum++);
			Object[] obj = studentData.get(key);
//			System.out.println("obj "+Arrays.toString(obj));
			int cellnum=0;
			for(Object object:obj)
			{
//				System.out.println("object " +object);
				cell = row.createCell(cellnum++);
				cell.setCellValue(object.toString());
			}
		}
		FileOutputStream fileo = new FileOutputStream(System.getProperty("user.dir")+"/StudentData.xlsx");
		workbook.write(fileo);
	}
	public static void readExcel() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/StudentData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;
		int totalRow = sheet.getLastRowNum();
		for(int i=0; i<totalRow;i++)
		{
			row = sheet.getRow(i);
			for(short j=0;j< row.getLastCellNum();j++)
			{
				
				if(j== row.getLastCellNum()-1)
				{
					System.out.print(row.getCell(j));
				}
				else
				{
					System.out.print(row.getCell(j)+", ");
				}
			}
			System.out.println();
		}
	}
	public static void PrintText(String text)
	{
		System.out.println("**************************************************************************");
		System.out.println("**********"+text+"***********************");
		System.out.println("**************************************************************************");
	}
	public static void main(String[] args) throws IOException 
	{
		UtilityClassbase.readExcel();
	}
}
