import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	private Problem3Class hw3;

	@Before
	public void setUp() throws Exception {
		hw3 =new Problem3Class();
	}

	@Test
	@FileParameters("src/Problem3TestCaseTable.csv")
	public void test(int testcase,double distance,boolean cruiseRequested,double speed,boolean red,boolean yellow,boolean green,boolean caution,boolean warning,boolean cruiseEngaged,String basispath,String mcdc) {
		hw3.setWarnings(cruiseRequested,distance,speed);
		assertEquals(hw3.isRedLight(), red);
		assertEquals(hw3.isYellowLight(), yellow);
		assertEquals(hw3.isCaution(), caution);
		assertEquals(hw3.isGreenLight(), green);
		assertEquals(hw3.isWarning(), warning);
		assertEquals(hw3.isCruiseEngaged(), cruiseEngaged);
		
		
	}

}