package cmsc355;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionalNumberTest {
	FractionalNumber test1 = new FractionalNumber(0,5);
	
	
	FractionalNumber fourth = new FractionalNumber(1, 4);
	
	@Test
	void testFractionalNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNumerator() {
		FractionalNumber third = new FractionalNumber(1, 3);
		assertEquals(third.getNumerator(), 1);
	}

	@Test
	void testGetDenominator() {
		FractionalNumber half = new FractionalNumber(1, 2);
		assertEquals(half.getDenominator(), 2);
	}

	@Test
	void testSetNumerator() {
		test1.setNumerator(4);
		assertEquals(test1.getNumerator(), 4);
	}

	@Test
	void testSetDenominatorZero() {
		FractionalNumber third = new FractionalNumber(1,3);
		third.setDenominator(0);
		assertEquals(third.getDenominator(), "Denominator cannot be 0.");
	}

	@Test
	void testFractionalNumberIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testAddZeroDenominator() {
		FractionalNumber zero = new FractionalNumber(4, 0);
		FractionalNumber half = new FractionalNumber(1, 2);
		
		
	}

	@Test
	void testSubtract() {
		FractionalNumber twoThirds = new FractionalNumber(2,3);
		FractionalNumber third = new FractionalNumber(1,3);
		
		twoThirds.subtract(third);
		assertEquals(twoThirds, third);
	}

	@Test
	void testMultiply() {
		FractionalNumber twoThirds = new FractionalNumber(2,3);
		FractionalNumber threeFifths = new FractionalNumber(3,5);
		FractionalNumber result = new FractionalNumber(6,15);
		twoThirds.multiply(threeFifths);
		//twoThirds should now equal 6/15. If false then fix code
		assertEquals(twoThirds, result);
	}

	@Test
	void testDivide() {
		FractionalNumber temp = new FractionalNumber(7, 15);
		FractionalNumber temp2 = new FractionalNumber(1,15);
		
		temp.divide(temp2);
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject1() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
