import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFecha {
	private UtilidadFecha utils;
	
	
	@BeforeEach
	void before(){
		//this.utils= new UtilidadFecha();
	}
	
	@Test
	void testDadoUnStringConFechaConFormatoddMMYYYYDevolverLocalDate() throws Exception {
		LocalDate fecha=utils.convertirAfecha ("05-02-2001",FormatosDeFecha.DD_MM_YYYY);
		assertEquals(2001,fecha.getYear());
		assertEquals(5,fecha.getDayOfMonth());
		assertEquals(Month.FEBRUARY,fecha.getMonth());
	}

	@Test
	void testDadoUnStringConFechaConFormatoMMddYYYYDevolverLocalDate() throws Exception {
		LocalDate fecha=utils.convertirAfecha ("02-05-2001",FormatosDeFecha.MM_DD_YYYY);
		assertEquals(2001,fecha.getYear());
		assertEquals(5,fecha.getDayOfMonth());
		assertEquals(Month.FEBRUARY,fecha.getMonth());
	}
	
	@Test
	void testFechaInvalida(){
		assertThrows(Exception.class,() -> {   //funcion anonima
			LocalDate fecha=utils.convertirAfecha ("02-05-2001",FormatosDeFecha.MM_DD_YYYY);
		});
		
		
		
	}
}
