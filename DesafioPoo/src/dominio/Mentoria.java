package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(){}

    @Override
    public double calcularXP() {
        return xpPadrao + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        
        return "["+getTitulo()+" , "+getDescricao()+" , "+ data+"]";
    }
    
}
