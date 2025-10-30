package dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate datainicial = LocalDate.now();
    private final LocalDate datafinal = datainicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Dev> conteudos = new LinkedHashSet<>();

    public Set<Dev> getConteudos() {
        return conteudos;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public LocalDate getDatainicial() {
        return datainicial;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setConteudos(Set<Dev> conteudos) {
        this.conteudos = conteudos;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        @Override
        public  boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bootcamp bot = (Bootcamp) obj;
        return Objects.equals(nome, bot.nome)&& Objects.equals(conteudos, bot.conteudos) && Objects.equals(datafinal, bot.datafinal)&& Objects.equals(datainicial, bot.datainicial)&& Objects.equals(devsInscritos, bot.devsInscritos)&& Objects.equals(descricao, bot.descricao);

    }

    

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(nome,devsInscritos,datafinal,datainicial,descricao,conteudos);
    }

    
}
