package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	
	private ControladorComputadora builder;
	
	public ComputadorDirector(ControladorComputadora builder) {
		this.builder=builder;
	}
	
	public void EnsamblarComputador() {
		builder.agregarRam();
		builder.Almacenamiento();
		builder.asignarMarca();
		builder.asignarrModelo();
		builder.asignarSistemaOperativo();
		builder.Mainboard();
		
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
