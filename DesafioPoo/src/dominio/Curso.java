package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(){}

    @Override
    public double calcularXP() {
        return xpPadrao + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        
        return "["+getTitulo()+" , "+getDescricao()+" , "+ cargaHoraria+"]";
    }
}
