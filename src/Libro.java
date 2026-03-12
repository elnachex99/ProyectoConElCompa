public class Libro {
    private String autor;
    private String editorial;
    private int edicion;


    public Libro(String autor, String editorial, int edicion) {
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
