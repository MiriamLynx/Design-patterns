package editor.dibujo;

import editor.figuras.Figura;
import editor.herramientas.HSeleccion;
import editor.herramientas.Herramienta;

public class Editor {
	
	private Dibujo dibujo;
	private Herramienta herramientaSeleccionada;
	
	public Editor(){
		dibujo = new Dibujo();
	}
	
	public void dibujar(){
		dibujo.dibujar();
	}
	
	public void pinchar(int x, int y){
		if(herramientaSeleccionada == null)
			setHerramientaSeleccionada(new HSeleccion(this));
		herramientaSeleccionada.pinchar(x, y);
	}
	
	public void soltar(int x, int y){
		if(herramientaSeleccionada == null)
			setHerramientaSeleccionada(new HSeleccion(this));
		herramientaSeleccionada.soltar(x, y);
		setHerramientaSeleccionada(null);
	}
	
	public void mover(int x, int y){
		if(herramientaSeleccionada == null)
			setHerramientaSeleccionada(new HSeleccion(this));
		herramientaSeleccionada.mover(x, y);
	}
	
	public Dibujo getDibujo() {
		return dibujo;
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}
	
	public Herramienta getHerramientaSeleccionada() {
		return herramientaSeleccionada;
	}

	public void setHerramientaSeleccionada(Herramienta herramientaSeleccionada) {
		this.herramientaSeleccionada = herramientaSeleccionada;
	}
	
	public Figura buscarFigura(int x, int y){
		return dibujo.buscarFigura(x, y);
	}

	public void addFigura(Figura figura) {
		dibujo.addFigura(figura);
	}
	
}
