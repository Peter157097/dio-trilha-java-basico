package dominio;

public abstract class Conteudo {

    protected static final double xpPadrao=100;
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}
