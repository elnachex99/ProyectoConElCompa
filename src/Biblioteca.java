import java.util.ArrayList;
public class Biblioteca{
    private String nombrePersona;
    private String nombreLibro;
    private String autor;
    private int cantidadDePaginas;
    private boolean ocupado;

    public Biblioteca(String nombrePersona, String nombreLibro, String autor, int cantidadDePaginas) {
        this.nombrePersona = nombrePersona;
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.cantidadDePaginas = cantidadDePaginas;
        this.ocupado = false;
    }




}