import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	private Problem4Class hw4;
	@Before
	public void setUp() throws Exception {
		hw4 =new Problem4Class();
	}

	@Test
	@FileParameters("src/Problem4TestCaseTable.csv")
	public void test(int testcase,boolean landing,double speed, double altitude,String retValue,String basispath,String mcdc) {
		hw4.landCraft(landing, altitude, speed);
		assertEquals(hw4.getAction(), Problem4Class.landing.valueOf(retValue));
		
	}

}