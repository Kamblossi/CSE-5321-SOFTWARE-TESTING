//package HW5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	private Problem3Class hw3;

	@Before
	public void setUp() throws Exception {
		hw3 = new Problem3Class();
	}

	@Test
	@FileParameters("src/Problem3TestCaseTable.csv")
	public void test(int testCaseNumber, int month, int day, int year, int prevDay) {
		assertEquals(prevDay, hw3.calcPrevDayNum(month, day, year));
	}

}
