import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem2ClassTest {

	private Problem2Class hw2;
	private double premium, taxRate, totalPremium;
	private boolean policyHolder, multiPolicies, primeStatus;
	private int yearsMember, safetyRating;

	@Before
	public void setUp() throws Exception {
		hw2 = new Problem2Class();
	}

	@Parameters
	public static Collection<Object[]> data() {
//		Parameters are: (1,2,3,4,5,6)
//		1=premium, 2=policyHolder, 3=yearsMember, 4=multiPolicies, 5=safetyRating, 6=taxRate
		return Arrays.asList(new Object[][] {
				// Test case 1
				{ 5_000.01d, true, 5, true, 500, 0.0825d, true, 4330.01d },
				// Test case 2
				{ 2_000.00d, true, 6, false, 500, 0.0825d, true, 1840.25d },
				// Test case 3
				{ 1250.01d, true, 6, false, 500, 0.0825d, true, 1217.82d },
				// Test case 4
				{ 350.00d, true, 6, false, 500, 0.0825d, true, 359.93d },
				// Test case 5
				{ 349.99d, true, 6, false, 500, 0.0825d, true, 378.86d },
				// Test case 6
				{ 349.99d, false, 6, false, 501, 0.0825d, true, 378.86d },
				// Test case 7
				{ 349.99d, false, 5, true, 501, 0.0825d, true, 378.86d },
				// Test case 8
				{ 349.99d, false, 5, false, 501, 0.0825d, false, 378.86d },
				// Test case 9
				{ 349.99d, false, 5, true, 500, 0.0825d, false, 378.86d },
				// Test case 10
				{ 1250.00d, true, 6, false, 500, 0.0825d, true, 1285.47d },
				// Test case 11
				{ 1999.99d, true, 6, false, 500, 0.0825d, true, 1948.49d },
				// Test case 12
				{ 5000.00d, true, 5, true, 500, 0.0825d, true, 4600.63d },
				// Test case 13
				{ 0.00d, false, 6, false, 501, 0.0825d, true, 0.00d },
				// Test case 14
				{ 10000.00d, false, 6, false, 501, 0.0825d, true, 8660.00d },
				// Test case 15
				{ 349.99d, false, 5, true, 1, 0.0825d, false, 378.86d },
				// Test case 16
				{ 349.99d, false, 5, true, 999, 0.0825d, true, 378.86d },
				// Test case 17
				{ 349.99d, false, 0, true, 500, 0.0825d, false, 378.86d },
				// Test case 18
				{ 349.99d, false, 50, true, 500, 0.0825d, true, 378.86d }
			});
	}

	public Problem2ClassTest(double premium, boolean policyHolder, int yearsMember, boolean multiPolicies,
			int safetyRating, double taxRate, boolean primeStatus, double totalPremium) {
		this.premium = premium;
		this.policyHolder = policyHolder;
		this.yearsMember = yearsMember;
		this.multiPolicies = multiPolicies;
		this.safetyRating = safetyRating;
		this.taxRate = taxRate;
		this.primeStatus = primeStatus;
		this.totalPremium = totalPremium;
	}

	@Test
	public void test() {
		hw2.determineInsPremium(premium, policyHolder, yearsMember, multiPolicies, safetyRating, taxRate);
		assertEquals(hw2.isPrimeStatus(), primeStatus);
		assertEquals(hw2.getTotalPremium(), totalPremium, 0.01);
	}
}