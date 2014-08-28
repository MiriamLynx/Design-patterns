package strategy;

public class Pato {
	
	private FormaDeGraznar graznido;
	private FormaDeVolar vuelo;
	
	public Pato(FormaDeGraznar graznido, FormaDeVolar vuelo){
		this.graznido = graznido;
		this.vuelo = vuelo;
	}
	
	public void graznar(){
		this.graznido.graznar();
	}
	
	public void volar(){
		this.vuelo.volar();
	}

}
