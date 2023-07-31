package baseLibrary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import constants.FrameConstants;
import randData.RandData;

public class ExcelUtil {
	@Test
	public static void writeExcel()
	{
		FileOutputStream fos = null;
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet();
		XSSFRow wr;
		XSSFCell wc;
		File file = new File(FrameConstants.getINSTANCE().getWrieExcelPath() + "/User.xlsx");
		try
		{
			fos = new FileOutputStream(file);
		} catch (Exception e) {
			UtilityClassbase.PrintText(
					"Issue in file outputsteam" + " line 22" + wb.getClass().getDeclaredMethods().toString());
			e.printStackTrace();

		}
		for (int i = 0; i < 30; i++)
		{
			wr = ws.createRow(i);
			for (int j = 0; j < 5; j++)
				if (i == 0) {

					switch (j) 
					{
					case 0: {

						wc = wr.createCell(j);
						wc.setCellValue("id");
						break;
					}

					case 1: {

						wc = wr.createCell(j);
						wc.setCellValue("name");
						break;
					}
					case 2: {

						wc = wr.createCell(j);
						wc.setCellValue("email");
						break;
					}
					case 3: {

						wc = wr.createCell(j);
						wc.setCellValue("gender");
						break;
					}
					case 4: {

						wc = wr.createCell(j);
						wc.setCellValue("status");
						break;
					}

					default:
						break;
					}
				} else {

					switch (j) {
					case 0: {

						wc = wr.createCell(j);
						wc.setCellValue(RandData.getId());
						break;
					}

					case 1: {

						wc = wr.createCell(j);
						wc.setCellValue(RandData.getFullName());
						break;
					}
					case 2: {

						wc = wr.createCell(j);
						wc.setCellValue(RandData.getEmail());
						break;
					}
					case 3: {

						wc = wr.createCell(j);
						wc.setCellValue(RandData.getGender());
						break;
					}
					case 4: {

						wc = wr.createCell(j);
						wc.setCellValue(RandData.getStatus());
						break;
					}

					default:
						break;
					}
				}
		}
		try {
			wb.write(fos);
			fos.close();
			wb.close();
		} catch (IOException e) {
			UtilityClassbase.PrintText(
					"Issue in file outputsteam" + " line 113" + wb.getClass().getDeclaredMethods().toString());
			e.printStackTrace();
		}

	}
}
