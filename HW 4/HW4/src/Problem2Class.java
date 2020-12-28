//package Homework3;

public class Problem2Class {
	
	private boolean primeStatus;
	private double totalPremium;

	public void determineInsPremium (double premium, boolean policyHolder, 
			 int yearsMember, boolean multiPolicies, int safetyRating, double taxRate) {
		double discount/*=0.0*/;

		if (premium > 5_000.00)
			discount = 0.2;
		else
			if (premium >= 2_000.00)
				discount = 0.15;
			else
				if (premium > 1_250.00)
					discount = 0.10;
				else
					if (premium >= 350.00)
						discount = 0.05;
					else
						discount = 0.00;

		if (policyHolder) 
			primeStatus = true;
		else
			if (yearsMember > 5)
				primeStatus = true;
			else
				if (multiPolicies)
					if (safetyRating > 500)
					primeStatus = true;
		
		totalPremium = (1+taxRate)*(1.0-discount)*premium;
	}

	public boolean isPrimeStatus() {
		return primeStatus;
	}

	public void setPrimeStatus(boolean primeStatus) {
		this.primeStatus = primeStatus;
	}

	public double getTotalPremium() {
		return totalPremium;
	}

	public void setTotalPremium(double totalPremium) {
		this.totalPremium = totalPremium;
	}
}