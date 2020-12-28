import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
	
	private Problem1Class hw1;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem1ClassTest() {
		return $(
//				Parameters are (1,2,3,4,5,6)
//				1=battery power, 2=red, 3=yellow, 4=green, 5=bell, 6=siren
// 				Test Case 1
				$(0, false, false, false, false, true),
				$(49.9, false, false, false, true, false),
				$(75, true, false, false, false, false ),
				$(124.9, true, true, false, false, false),
				$(250, false, true, false, false, false),
				$(250.1, false, false, true, false, false),
				$(0.1, false, false, false, true, false),
				$(50, true, false, false, false, false),
				$(75.1, true, true, false, false, false),
				$(125, false, true, false,false,false),
				$(1000, false, false, true, false, false)
		);
	}

	@Before
	public void setUp() throws Exception {
		hw1 = new Problem1Class();
	}

	@Test
	@Parameters(method = "parametersForProblem1ClassTest")
	public void test(double batteryPower, boolean red, boolean yellow, boolean green, boolean bell, boolean siren) {
		hw1.calcLights(batteryPower);
		assertEquals(hw1.isRedLight(), red);
		assertEquals(hw1.isYellowLight(), yellow);
		assertEquals(hw1.isGreenLight(), green);
		assertEquals(hw1.isBell(), bell);
		assertEquals(hw1.isSiren(), siren);
	}

}