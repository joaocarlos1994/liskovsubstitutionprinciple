package br.com.liskovsubstitutionprinciple;

public class Pombo extends Passaro{

	private double altitute;
	
	public Pombo(String name, double local, double altitute) {
		super(name, local);
		this.altitute = altitute;
		// TODO Auto-generated constructor stub
	}
	
	public void mudarAltitude(double altitude){
		if(altitude > 0){
			this.altitute = altitude;
		}
	}

	public double getAltitute() {
		return altitute;
	}

}
