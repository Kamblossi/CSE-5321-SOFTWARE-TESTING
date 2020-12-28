import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {
	
	private Problem5Class hw5;
	@Before
	public void setUp() throws Exception {
		hw5 =new Problem5Class();
	}

	@Test
	@FileParameters("src/Problem5TestCaseTable.csv")
	public void test(int testcase, double x,double y,String basispath) {
		assertEquals(hw5.calcY(x), y,0.001d);
		
	}

}