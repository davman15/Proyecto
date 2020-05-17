import java.util.ArrayList;

public abstract class Europa extends Reinos {
	
	private String territorio;
	private boolean guerra;
	private int distanciaAragon;
	private int distanciaAustria;
	private int distanciaBorgo�a;
	private int distanciaCastilla;
	private int distanciaNuevaEsapa�a;
	
	public Europa(String nombre, double pib, String continente, ArrayList<Flota> flota, int poblacion,
			String responsable, ArrayList<Mercancia> imporatacion, ArrayList<Mercancia> exportacion, double dinero,
			boolean sublevaciones,String territorio,boolean guerra,int aragon,int austria,int borgo�a,int castilla,int nuevaEspa�a) {
		super(nombre, pib, continente, flota, poblacion, responsable, imporatacion, exportacion, dinero, sublevaciones);
		this.territorio=territorio;
		this.guerra=guerra;
		this.distanciaAragon=aragon;
		this.distanciaAustria=austria;
		this.distanciaBorgo�a=borgo�a;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaEsapa�a=nuevaEspa�a;
	}
	
	public Europa(Europa obj) {
		super(obj);
		this.distanciaAragon=obj.getDistanciaAragon();
		this.distanciaAustria=obj.getDistanciaAustria();
		this.distanciaBorgo�a=obj.getDistanciaBorgo�a();
		this.distanciaCastilla=obj.getDistanciaCastilla();
		this.distanciaNuevaEsapa�a=obj.getDistanciaNuevaEsapa�a();
		this.guerra=obj.isGuerra();
		this.territorio=obj.getTerritorio();
	}

	public String getTerritorio() {
		return territorio;
	}

	public void setTerritorio(String territorio) {
		this.territorio = territorio;
	}

	public boolean isGuerra() {
		return guerra;
	}

	public void setGuerra(boolean guerra) {
		this.guerra = guerra;
	}

	public int getDistanciaAragon() {
		return distanciaAragon;
	}

	public void setDistanciaAragon(int distanciaAragon) {
		this.distanciaAragon = distanciaAragon;
	}

	public int getDistanciaAustria() {
		return distanciaAustria;
	}

	public void setDistanciaAustria(int distanciaAustria) {
		this.distanciaAustria = distanciaAustria;
	}

	public int getDistanciaBorgo�a() {
		return distanciaBorgo�a;
	}

	public void setDistanciaBorgo�a(int distanciaBorgo�a) {
		this.distanciaBorgo�a = distanciaBorgo�a;
	}

	public int getDistanciaCastilla() {
		return distanciaCastilla;
	}

	public void setDistanciaCastilla(int distanciaCastilla) {
		this.distanciaCastilla = distanciaCastilla;
	}

	public int getDistanciaNuevaEsapa�a() {
		return distanciaNuevaEsapa�a;
	}

	public void setDistanciaNuevaEsapa�a(int distanciaNuevaEsapa�a) {
		this.distanciaNuevaEsapa�a = distanciaNuevaEsapa�a;
	}


}
