package entities;

public class Televisor {
	
	public int canal = 1;
    public int volume = 0;
    public boolean ligado;
    public String ligadoT = "ligado";
    public String desligadoT = "desligado";
    
    public void aumentarVolume(){
        if(ligado)
            if(volume <= 10)
                volume =+ 1;
    }
    
    public void reduzirVolume(){
        if(ligado)
            if(volume >= 0)
                volume =- 1;
    }
    
    public void subirCanal(){
        if(ligado)
            if(canal < 16)
                canal =+ 1;
    }
    
    public void descerCanal(){
        if(ligado)
            if(canal > 1)
                canal =- 1;   
    }
   
    public void ligarTelevisor(){
        ligado=true;
    }
    
    public void ligarTelevisorT(){
        ligado=true;
        if(ligado==true)
        	System.out.println("ligado");
    }
    
    public void desligarTelevisor(){
        ligado=false;
    }
    
    public void desligarTelevisorT(){
        ligado=false;
        if(ligado==false)
        	System.out.println("desligado");
    }
    
    public void mostraStatus(){
        if(ligado)
            System.out.println("Est� no canal " + canal + ", no volume " + volume + " e o televisor esta " + ligadoT + ".");
        else
            System.out.println("Est� no canal " + canal + ", no volume " + volume + " e o televisor esta " + desligadoT + ".");
    }
}
