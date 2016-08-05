package br.com.liskovsubstitutionprinciple;

public abstract class Passaro {

	private final String name;
	private double local;

	public Passaro(String name, double local) {
		super();
		this.name = name;
		this.local = local;
	}

	public String getName() {
		return name;
	}

	public double getLocal() {
		return local;
	}

}
