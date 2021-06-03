package apachePoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SumaBrojeva {
	/* Napraviti novi projekat i u njega dodati biblioteke za apache poi. Kao na
	 * casu, doci do lokacije na vasem kompjuteru i tamo prekopirati fajl koji sam
	 * okacila (domaci.xlsx). Ako bude problema sa citanjem fajla koji vam okacih, a
	 * vi molim vas onda ipak kreirajte novi excel, posto radim na linuxu danas
	 * shvatismo da moze da se desi da se nesto izbagovalo.
	 * 
	 * Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel
	 * tabele koji se zove Brojevi. U tabeli svi brojevi se nalaze u prvoj koloni.
	 * Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
	 * Ukupnu sumu na kraju treba ispisati na standardnom izlazu. Potrebno je
	 * omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva. */

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("domaci.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			
			int rows = sheet.getLastRowNum();
					
			double sum = 0;
			for (int i = 0; i < rows + 1; i++) {
				Row row1 = sheet.getRow(i);
				Cell cell1 = row1.getCell(0);
				sum = sum + cell1.getNumericCellValue();				
			}
			System.out.println("Ukupna suma je: " + sum);
			wb.close();			
		}		
		catch (IOException e) {
			System.out.println("Odgovarajuci fajl nije pronadjen");
			e.printStackTrace();
		}
		
	}

}
