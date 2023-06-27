package model;

public class Livro {
    private String titulo;
    private String escritor;
    private int anoLancamento;
    private String genero;
    private int id;

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id  + ", titulo=" + titulo + ", escritor=" + escritor + ", anoLancamento=" + anoLancamento + ", genero=" + genero +  '}';
    }

   
    
    
    
    
    
}
