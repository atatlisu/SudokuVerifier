import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerifyR1() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution ="41736A5";
		int result= verifier.verify(candidateSolution);
		assertTrue(result == -1); 
	}
	@Test
	
	public void testVerifyR2() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution ="123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		int result= verifier.verify(candidateSolution);
		assertTrue(result == -2); 
	}
	@Test
	public void testVerifyTrue() {
		SudokuVerifier verifier = new SudokuVerifier();
		String candidateSolution ="417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int result= verifier.verify(candidateSolution);
		assertTrue(result == 0); 
	}
	
	
}
