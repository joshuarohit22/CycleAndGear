import java.io.*;


public class Gear {
	private int chainring;
	private int cog;

	private Wheel wheel;

	public Gear(int chainring, int cog, int rim, double tire) {
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	public int getChainring() {
		return this.chainring;
	}

	public int getCog() {
		return this.cog;
	}

	public int getRim() {
		return this.rim;
	}

	public double getTire() {
		return this.tire;
	}

	public double ratio() {
		return (chainring * 1.0) / (cog * 1.0);
	}

	public double gearInches() {
		return this.ratio() * ( rim + (tire * 2) );
	}

	public double diameter() {
		return this.rim + (this.tire * 2);
	}

}

