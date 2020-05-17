import java.util.ArrayList;

public class Austria extends Europa {

        private MateriasPrimas recoleccionHierro;
        private Alimentos recoleccionArroz;
        private MateriasPrimas recoleccionAlgodon;



        public Austria(String nombre, double pib, String continente,ArrayList<Flota> flota,int poblacion,String responsable,ArrayList<Mercancia> importacion,ArrayList<Mercancia> exportacion,double dinero,String territorio,boolean guerra,
                boolean sublevaciones,int aragon, int austria, int borgoña, int castilla, int nuevaEspaña,MateriasPrimas recoleccionHierro,Alimentos recoleccionArroz, MateriasPrimas recoleccionAlgodon) {
            super(nombre, pib, continente, flota, poblacion, responsable, importacion, exportacion, dinero, sublevaciones,territorio,guerra,aragon, austria, borgoña, castilla, nuevaEspaña);
            this.recoleccionHierro=recoleccionHierro;
            this.recoleccionArroz=recoleccionArroz;

        }


        public Austria(Austria a) {
            super(a);
            this.recoleccionArroz=a.getRecoleccionArroz();
            this.recoleccionHierro=a.getRecoleccionHierro();
            this.recoleccionAlgodon=a.getRecoleccionAlgodon();
        }

        public MateriasPrimas getRecoleccionAlgodon() {
            return recoleccionAlgodon;
        }

        public void setRecoleccionAlgodon(MateriasPrimas recoleccionAlgodon) {
            this.recoleccionAlgodon = recoleccionAlgodon;
        }

        public MateriasPrimas getRecoleccionHierro() {
            return recoleccionHierro;
        }

        public void setRecoleccionHierro(MateriasPrimas recoleccionHierro) {
            this.recoleccionHierro = recoleccionHierro;
        }

        public Alimentos getRecoleccionArroz() {
            return recoleccionArroz;
        }

        public void setRecoleccionArroz(Alimentos recoleccionArroz) {
            this.recoleccionArroz = recoleccionArroz;
        }



}