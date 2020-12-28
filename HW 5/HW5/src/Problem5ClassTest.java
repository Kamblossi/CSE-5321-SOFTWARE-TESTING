import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	private Problem5Class hw5;
	@Before
	public void setUp() throws Exception {
		hw5 =new Problem5Class();
	}
	@Test
	@FileParameters("src/Problem5TestCaseTable.csv")
	public void test(int testCase,double cart,boolean coupon,int memberPts,int items,boolean member,double taxRate,double result) {
		assertEquals(result,hw5.determineTotal(cart, member, items, coupon, memberPts, taxRate),0.006);
	}

}