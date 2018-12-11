package emsamablajecomputadoras.creacional;

public class AsusRoge extends ControladorComputadora {
	public AsusRoge() {
		
		computador = new Computador();
		
	}
	@Override
	public void asignarMarca() {
		computador.setMarca("Asus");
		
	}

	@Override
	public void asignarrModelo() {
		computador.setModelo("ROG");
		
		
	}

	@Override
	public void Almacenamiento() {
		computador.setTipoAlmacenamiento("HDD");
		computador.setAlmacenamiento(1000);
		
	}

	@Override
	public void agregarRam() {
		computador.setTipoRAM("DDR4");
		computador.setRAM(32);
		
		
	}

	@Override
	public void Mainboard() {
		computador.setPlaca(new Mainboard("Strix", "x99"));
		
	}

	@Override
	public void asignarSistemaOperativo() {
		computador.setOS(new SistemaOperativo("Windows", 64, "10 PRO"));
		
	}

}
