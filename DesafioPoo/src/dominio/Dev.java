package dominio;

import java.util.*;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public String getNome() {
        return nome;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void pogredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());

        }else{
            System.out.println("Não matriculado ");
        }
    }

    public double calcularXP(){
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
    }

    @Override
    public  boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;
        return Objects.equals(nome, dev.nome)&& Objects.equals(conteudosConcluidos, dev.conteudosConcluidos) && Objects.equals(conteudosInscritos, dev.conteudosInscritos);
    }

    

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(nome,conteudosConcluidos,conteudosInscritos);
    }
    
}


