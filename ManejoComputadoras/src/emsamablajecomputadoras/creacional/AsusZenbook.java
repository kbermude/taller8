package emsamablajecomputadoras.creacional;

public class AsusZenbook extends ControladorComputadora {
	public AsusZenbook() {
		
		computador = new Computador();
		
	}
	
	@Override
	public void asignarMarca() {
		computador.setMarca("Asus");
		
	}

	@Override
	public void asignarrModelo() {
		computador.setModelo("Zenbook");
		
		
	}

	@Override
	public void Almacenamiento() {
		computador.setTipoAlmacenamiento("SSD");
		computador.setAlmacenamiento(500);
		
	}

	@Override
	public void agregarRam() {
		computador.setTipoRAM("DDR3");
		computador.setRAM(16);
		
	}

	@Override
	public void Mainboard() {
		
		computador.setPlaca(new Mainboard("Prime", "Z370"));
		
	}

	@Override
	public void asignarSistemaOperativo() {
		computador.setOS(new SistemaOperativo("Windows", 64, "10 Home"));
		
	}

}
