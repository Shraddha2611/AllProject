package Shraddha;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	
	public ArrayList<String> getdata(String testCaseName) throws IOException {
		ArrayList<String> alist = new ArrayList<String>();
		FileInputStream file = new 	FileInputStream("C:\\Users\\Shraddha\\Documents\\excelpoi.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		int sheet = workbook.getNumberOfSheets();
		
		for(int i=0; i<sheet;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Testdata")) //point to sheet name as Testdata
			{
				XSSFSheet xsheet =	workbook.getSheetAt(i); //all the data of sheet is now in xsheet
				
				Iterator<Row> rows = xsheet.iterator(); //xsheet is collection of rows
				Row firstrow = rows.next(); //move to first row
				
				Iterator <Cell> cell = firstrow.cellIterator(); //rows is a collection of columns
				int k = 0,column=0;
				while(cell.hasNext()) //check next cell is present or not  
				{
					Cell firstcell = cell.next();  //store the value of first cell into object firstcell 
					if(firstcell.getStringCellValue().equalsIgnoreCase("TestCase"))  //check for cell name as TestCase
					{
						column = k ;  //idex of increment and cell matches
					}
					k++; 
				}
				System.out.println(column); //print index of TestCase

				while(rows.hasNext())  //check for next row is present or not
				{
					Row re = rows.next();  //store the value of first row into re 
					if(re.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))//check if first column has Add profile row
					{
						Iterator <Cell> ce = re.cellIterator(); //iterat add profile column into cell and store into ce
						while(ce.hasNext()) //check if next cell is present or not
						{
							Cell s = ce.next();
							if(s.getCellType()== CellType.STRING){
								
							alist.add(s.getStringCellValue()); //print all the cell value of add profile row
							}
							else {
								alist.add(NumberToTextConverter.toText(s.getNumericCellValue()));
							}
						}
					}
				}
			}	
		}
		return alist;	
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

 }

