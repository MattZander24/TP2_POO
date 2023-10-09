package ar.edu.unlu.POO.TP2.EJ14;

public class Transporte extends Proveedor{
    private String tipo;
    private double importeFinal;
    public Transporte(String nombre, double importeBase) {
        super(nombre, importeBase);
        tipo = "Transporte";
        importeFinal = importeBase * 1.3;
    }


    public double getImporteFinal() {
        return importeFinal;
    }
}
