package editor.figuras;

public interface Figura {
	
	public void dibujar();
	
	public void mover(int x, int y);
	
	public boolean contiene (int x, int y);
}
