import java.time.LocalDate;

import dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        
        curso1.setCargaHoraria(8);
        curso1.setDescricao("curso de java");
        curso1.setTitulo("cursinha java");

        curso2.setCargaHoraria(12);
        curso2.setDescricao("curso de py");
        curso2.setTitulo("cursinha py");


        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Mentor java");
        mentoria.setTitulo("Mentor");

        System.out.println(mentoria);
        System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        Dev devs1 = new Dev();
        devs1.setNome("Camila");
        devs1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos de usuarios"+ devs1.getConteudosInscritos());
        devs1.pogredir();
        devs1.pogredir();
        devs1.pogredir();
        System.out.println("Conteudos conluidos"+ devs1.getConteudosConcluidos());
        System.out.println("Conteudos de usuarios"+ devs1.getConteudosInscritos());
        System.out.println("XP: "+ devs1.calcularXP());
        

        Dev devs2 = new Dev();
        devs2.setNome("Peter");
        devs2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos de usuarios"+ devs2.getConteudosInscritos());
        devs2.pogredir();
        devs2.pogredir();
        System.out.println("Conteudos conluidos"+ devs2.getConteudosConcluidos());
        System.out.println("Conteudos de usuarios"+ devs2.getConteudosInscritos());
        System.out.println("XP: "+ devs1.calcularXP());
    }
}
