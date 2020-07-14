import java.io.*;


public class Gear {
	private int chainring;
	private int cog;

	public Gear(int chainring, int cog) {
		this.chainring = chainring;
		this.cog = cog;
	}

	public double ratio() {
		return (chainring * 1.0) / (cog * 1.0);
	}

}