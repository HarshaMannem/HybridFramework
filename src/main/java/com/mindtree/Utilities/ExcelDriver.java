package com.mindtree.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriver {
	public static XSSFSheet sheet;
	public static XSSFWorkbook workbook;
	public static String excelpath=ConfigProperty.getExcelpath();
	public static HashMap<String,String> excelinfo=new HashMap<String, String>();
	public static void WorkBookSetup() throws IOException
	{
		FileInputStream file=new FileInputStream(excelpath);
	    workbook=new XSSFWorkbook(file);
		for(int i=0;i<workbook.getNumberOfSheets();i++)
		{

			XSSFSheet sheet=workbook.getSheetAt(i);
			Iterator<Row>rows=sheet.iterator();
			while(rows.hasNext())
			{
				int c=0;
				Iterator<Cell>cells=rows.next().cellIterator();
				String key="";
				while(cells.hasNext())
				{
					String data=cells.next().toString();
					if(c==0)
					{
						excelinfo.put(data,"");
						key=data;
					}
					else
					{
						excelinfo.put(key,data);
					}
					c++;
				}
			}
		}
	//	System.out.println(excelData);
		
	}
	public static String getData(String key)
	{
		return excelinfo.get(key);
	}
	
}
