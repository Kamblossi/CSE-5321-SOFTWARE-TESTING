package Homework3;

public class Problem3Class {

	private boolean redLight,yellowLight,greenLight,caution,warning,cruiseEngaged;
	
	public void setWarnings (boolean cruiseRequested, double distance, double speed) {
		
		if (distance >= 200.0)
			greenLight=true;
		else
			if (distance > 100.0)
				yellowLight=true;
			else {
				redLight=true;
				if (distance >= 75.0)
					caution=true;
				else
					warning=true;
			}

		if (cruiseRequested)
			if (distance >= 50.0)
				if (speed > 40)
					if (speed <= 65.0)
						cruiseEngaged = true;
	}

	public boolean isRedLight() {
		return redLight;
	}

	public void setRedLight(boolean redLight) {
		this.redLight = redLight;
	}

	public boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight(boolean yellowLight) {
		this.yellowLight = yellowLight;
	}

	public boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight(boolean greenLight) {
		this.greenLight = greenLight;
	}

	public boolean isCaution() {
		return caution;
	}

	public void setCaution(boolean caution) {
		this.caution = caution;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public boolean isCruiseEngaged() {
		return cruiseEngaged;
	}

	public void setCruiseEngaged(boolean cruiseEngaged) {
		this.cruiseEngaged = cruiseEngaged;
	}
}