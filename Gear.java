import java.io.*;


public class Gear {
	private int chainring;
	private int cog;

	private int rim;
	private double tire;

	public Gear(int chainring, int cog, int rim, double tire) {
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	public double ratio() {
		return (chainring * 1.0) / (cog * 1.0);
	}

	public double gearInches() {
		return this.ratio() * ( rim + (tire * 2) );
	}

}

