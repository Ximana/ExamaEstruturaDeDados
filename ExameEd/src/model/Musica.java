package model;

public class Musica {
    private String titulo;
    private String cantor;
    private String estilo;

    public Musica() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Musica{" + "titulo=" + titulo + ", cantor=" + cantor + ", estilo=" + estilo + '}';
    }
    
    
    
}
