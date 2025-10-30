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
        
    }
}
