package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercice3.CaractereInterditException;
import exercice3.ValeurImpossibleException;

import org.junit.jupiter.api.Test;
class ValeurImpossibleExceptionTest {

	@Test
	
	void testSetValue() throws ValeurImpossibleException{
		ValeurImpossibleException myvalue = new ValeurImpossibleException (11);
		System.out.println( 11 );
	}

}
