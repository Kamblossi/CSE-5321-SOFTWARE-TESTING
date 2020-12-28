import static org.junit.Assert.assertEquals;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	
	private Problem4Class hw4;
	Problem4ServerData mockobject;
	

	@Before
	public void setUp() throws Exception {
		hw4 = new Problem4Class();
		mockobject = EasyMock.strictMock(Problem4ServerData.class);
	}

	@Test
	@FileParameters("src/Problem4TestCaseTable.csv")
	public void test(int testcaseno, double batteryPower, boolean red, boolean yellow, boolean green, boolean bell, boolean siren) {
		EasyMock.expect(mockobject.getBatteryPower()).andReturn(batteryPower);
		EasyMock.replay(mockobject);
		hw4.calcLights(mockobject);
		assertEquals(hw4.isRedLight(), red);
		assertEquals(hw4.isYellowLight(), yellow);
		assertEquals(hw4.isGreenLight(), green);
		assertEquals(hw4.isBell(), bell);
		assertEquals(hw4.isSiren(), siren);
	}

}