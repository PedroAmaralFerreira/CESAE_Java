package FichaPratica08.Ex_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, int numPaginas, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void exigirDetalhes(){
        System.out.println("Livro: "+this.titulo);
        System.out.println("Autor/a: "+this.autor);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Número de páginas: "+this.numPaginas);
        System.out.println("ISBN: "+this.isbn);
    }

}
