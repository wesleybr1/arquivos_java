package principal;

import entities.Televisor;

public class Program {

	public static void main(String[] args) {
		Televisor tv = new Televisor();
	     
		tv.ligarTelevisor();
		
		tv.subirCanal();
		
		tv.aumentarVolume();
		
		tv.mostraStatus();
		
		tv.desligarTelevisor();
		
		tv.mostraStatus();

	}
}