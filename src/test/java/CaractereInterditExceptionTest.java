package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import exercice3.CaractereInterditException;

class CaractereInterditExceptionTest {

	@Test
	
	void testSetValue() throws CaractereInterditException {
		CaractereInterditException myvalue = new CaractereInterditException (10);
		System.out.println( 10 );
		
	}

}
