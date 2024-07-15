import br.com.dio.desafio2.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descriçao do curso");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("descriçao da mentoria");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();;
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("---------------");


        Dev devPatricia = new Dev();
        devPatricia.setNome("Patricia");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Patricia: " + devPatricia.getConteudosInscritos());
        devPatricia.progredir();
        devPatricia.progredir();
        devPatricia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Patricia: " + devPatricia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Patricia: " + devPatricia.getConteudosConcluidos());
        System.out.println("XP: " + devPatricia.calcularTotalXp());

    }
}