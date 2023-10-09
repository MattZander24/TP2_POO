package ar.edu.unlu.POO.TP2.EJ8;

public class Tesis extends Publicacion {
    private String autor;
    private int mes;

    public Tesis(String nombre, String editor, String telContacto, int cantPaginas, int ANIOPUBLICACION,String autor, int mes) {
        super(nombre, editor, telContacto, cantPaginas, ANIOPUBLICACION);
        this.autor = autor;
        this.mes = mes;
    }
}
