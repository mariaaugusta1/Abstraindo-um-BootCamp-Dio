import desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDuda = new Dev();
        devDuda.setNome("Duda");
        devDuda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Duda" + devDuda.getConteudosInscritos());
        devDuda.progredir();
        System.out.println("-");
        devDuda.progredir();
        System.out.println("Conteudos inscritos de Duda" + devDuda.getConteudosInscritos());
        System.out.println("Conteudos concluídos de Duda" + devDuda.getConteudosConcluidos());
        System.out.println("XP de Duda:" + devDuda.calcularTotalXp());
     /*   Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Jose" + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("Conteudos concluídos de Jose" + devJose.getConteudosConcluidos());*/

    }
}
