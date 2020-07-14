import java.io.*;


class Wheel {
	private int rim;
	private double tire;

	public Wheel(int rim, double tire) {
		this.rim = rim;
		this.tire = tire;
	}

	public double diameter() {
		return this.rim + (this.tire * 2);
	}

	public double circumference() {
		return this.diameter() * Math.PI;
	}

	public int getRim() {
		return this.rim;
	}

	public double getTire() {
		return this.tire;
	}

}

public class Gear {
	private int chainring;
	private int cog;
	private Wheel wheel;


	public Gear(int chainring, int cog, Wheel wheel) {
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}

	public int getChainring() {
		return chainring;
	}

	public int getCog() {
		return cog;
	}

	public int getRim() {
		return wheel.getRim();
	}

	public double getTire() {
		return wheel.getTire();
	}

	public double ratio() {
		return (chainring * 1.0) / (cog * 1.0);
	}

	public double gearInches() {
		return this.ratio() * wheel.diameter();
	}

	public double diameter() {
		return wheel.diameter();
	}

}

