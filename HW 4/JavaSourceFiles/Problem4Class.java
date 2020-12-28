package Homework3;

public class Problem4Class {

	public enum landing {engageRetro, disengageRetro, deployPods, orbit};
	private Problem4Class.landing action;

	public void landCraft (boolean landing, double altitude, double speed) {
		action=Problem4Class.landing.orbit;
		if (landing) 
			if (speed > 500.0) {
				if (altitude >= 2_500.0)
					if (altitude < 5_000.0)
						action = Problem4Class.landing.engageRetro; }
			else {
				if (speed >= 150.0)
					if (altitude > 1_000.0)
						if (altitude < 2_500.0)
							action = Problem4Class.landing.deployPods; }
		else
			action = Problem4Class.landing.disengageRetro;
	}

	public Problem4Class.landing getAction() {
		return action;
	}

	public void setAction(Problem4Class.landing action) {
		this.action = action;
	}
}