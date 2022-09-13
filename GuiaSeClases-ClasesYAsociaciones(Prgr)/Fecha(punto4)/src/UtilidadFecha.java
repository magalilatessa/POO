import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UtilidadFecha {

	public static LocalDate convertirAfecha(String string,FormatosDeFecha formato) throws Exception {
		try {
			return LocalDate.parse(string, DateTimeFormatter.ofPattern(formato.getMascara()) );
		}catch(DateTimeParseException ex){
			throw new Exception ("Fecha no válida");
		}
		
		
		
	}
	
}
