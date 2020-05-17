import java.util.ArrayList;

public class NuevaEspa�a extends Virreinatos {
	

	
	private Alimentos recoleccionMaiz;
	private MateriasPrimas recoleccionOro;
	private Alimentos recoleccionCacao;
	private Alimentos recoleccionTomate;
	
	public NuevaEspa�a(String nombre, double pib, String continente, ArrayList<Flota> flota, int poblacion,
			String responsable, ArrayList<Mercancia> imporatacion, ArrayList<Mercancia> exportacion, double dinero,
			boolean sublevaciones, int peru, int plata, int castilla, int granada, int nuevaEspa�a,Alimentos maiz,MateriasPrimas oro,Alimentos cacao,Alimentos tomate) {
		super(nombre, pib, continente, flota, poblacion, responsable, imporatacion, exportacion, dinero, sublevaciones, peru,
				plata, castilla, granada, nuevaEspa�a);
		this.recoleccionMaiz=maiz;
		this.recoleccionOro=oro;
		this.recoleccionCacao=cacao;
		this.recoleccionTomate=tomate;
	}
	
	public NuevaEspa�a(NuevaEspa�a obj) {
		super(obj);
		this.recoleccionMaiz=obj.getRecoleccionMaiz();
		this.recoleccionOro=obj.recoleccionOro;
		this.recoleccionCacao=obj.recoleccionCacao;
		this.recoleccionTomate=obj.getRecoleccionTomate();
	}

	public Alimentos getRecoleccionMaiz() {
		return recoleccionMaiz;
	}

	public void setRecoleccionMaiz(Alimentos recoleccionMaiz) {
		this.recoleccionMaiz = recoleccionMaiz;
	}

	public MateriasPrimas getRecoleccionOro() {
		return recoleccionOro;
	}

	public void setRecoleccionOro(MateriasPrimas recoleccionOro) {
		this.recoleccionOro = recoleccionOro;
	}

	public Alimentos getRecoleccionCacao() {
		return recoleccionCacao;
	}

	public void setRecoleccionCacao(Alimentos recoleccionCacao) {
		this.recoleccionCacao = recoleccionCacao;
	}

	public Alimentos getRecoleccionTomate() {
		return recoleccionTomate;
	}

	public void setRecoleccionTomate(Alimentos recoleccionTomate) {
		this.recoleccionTomate = recoleccionTomate;
	}
	
}
