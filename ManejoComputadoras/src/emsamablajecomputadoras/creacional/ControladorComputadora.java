package emsamablajecomputadoras.creacional;

public abstract class ControladorComputadora {
	protected Computador computador;
	
	public void nuevo() {
		computador = new Computador();
	}
	public Computador getComputador() {
		return computador;
	}
	
	public abstract void asignarMarca();
	public abstract void asignarrModelo();
	public abstract void Almacenamiento();
	public abstract void agregarRam();
	public abstract void Mainboard();
	public abstract void asignarSistemaOperativo();
	
}
