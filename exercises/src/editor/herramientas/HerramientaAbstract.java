package editor.herramientas;

import editor.dibujo.Editor;

public abstract class HerramientaAbstract implements Herramienta {

	protected Editor editor;

	public HerramientaAbstract(Editor editor) {
		this.editor = editor;
	}

}
