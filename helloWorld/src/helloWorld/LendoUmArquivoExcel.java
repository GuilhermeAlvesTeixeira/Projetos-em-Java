package helloWorld;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class LendoUmArquivoExcel {
	public static void main(String[] args) throws IOException {
		
		String excelFilePath=".\\datafiles\\ExcelFile.xlsx";
		
		//Criando um objeto inputStream para abrir armazenar o caminho do arquivo local do Excel.
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		
		//Criando um Workbook passando InputStream como parâmetro.
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
		//Criando uma planilha no Excel.
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Criando um objeto da classe iterator para percorrer as linhas do Excel.
		Iterator iterator = sheet.iterator();
		while(iterator.hasNext()) {

			//Criando um objeto da classe Iterator para percorrer as células do Excel.
			XSSFRow row = (XSSFRow) iterator.next();	
			Iterator cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();

				//Criando um Switch Case para printar o conteúdo das células de acordo com seu tipo.
				switch(cell.getCellType()) {
				case STRING: System.out.println(cell.getStringCellValue());
				break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());
				break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());
				break;
				}
			}
		}
		
		}
		
		
	}

