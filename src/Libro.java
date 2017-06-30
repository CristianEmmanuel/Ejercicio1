/**
 * Created by cristian on 30/06/17.
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int num_de_pag;

    public Libro(int ISBN, String titulo, String autor, int num_de_pag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.num_de_pag = num_de_pag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_de_pag() {
        return num_de_pag;
    }

    public void setNum_de_pag(int num_de_pag) {
        this.num_de_pag = num_de_pag;
    }

    @Override
    public String toString() {
        return "Libro{" + "Con ISBN =" + ISBN + ", El Libro ='" + titulo + '\'' + ", Del Autor ='"
                + autor + '\'' + ", Con La Cantidad De Paginas =" + num_de_pag + '}';
    }


}
