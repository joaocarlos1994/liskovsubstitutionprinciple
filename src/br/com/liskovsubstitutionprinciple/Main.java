package br.com.liskovsubstitutionprinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Passaro> listPassaros = new ArrayList<>();
		
		Pombo pombo = new Pombo("Pombo", 1.1f, 5.1f);
		Pinguin pinguin = new Pinguin("Pinguin", 1.2f);
		
		listPassaros.add(pinguin);
		listPassaros.add(pombo);
		
		for (Passaro passaro : listPassaros) {
			System.out.println(passaro.getName());
		}
		
		
	}

}
