import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class hw1;
	@Before
	public void setUp() throws Exception {
		hw1 =new Problem1Class();
	}
	@Test
	@FileParameters("src/Problem1TestCaseTable.csv")
	public void test(int testCase,double cart,boolean coupon,int memberPts,int items,boolean member,double taxRate,double result) {
		assertEquals(result,hw1.determineTotal(cart, member, items, coupon, memberPts, taxRate),0.006);
	}

}