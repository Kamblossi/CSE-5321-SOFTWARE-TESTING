import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

	private Problem2Class hw2;
	@Before
	public void setUp() throws Exception {
		hw2 =new Problem2Class();
	}
	@Test
	@FileParameters("src/Problem2TestCaseTable.csv")
	public void test(int testCaseNo,double distance,double speed,boolean cruiseEngaged,boolean applyBreaks,double breakingFactor) {
		hw2.autoBraking(distance, speed, cruiseEngaged);
		assertEquals(applyBreaks,hw2.isApplyBrakes());
		assertEquals(breakingFactor, hw2.getBrakingFactor(),0.001);
		
		
	}

}