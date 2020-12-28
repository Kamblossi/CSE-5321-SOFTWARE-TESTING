package Homework3;

public class Problem5Class {

	public double calcY (double x) {
		double y;
		if (x<-4.0)
			y=0.0;
		else
			if (x<=-2.0)
				y=x+4;
			else
				if (x<2.0)
					y=(x-2)*(x+2)+2.0;
				else
					if (x<4.0)
						y=4-x;
					else
						y=0.0;
		return y;
		}
	}