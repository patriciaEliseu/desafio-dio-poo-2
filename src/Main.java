import br.com.dio.desafio2.dominio.Curso;
import br.com.dio.desafio2.dominio.Mentoria;

import java.time.LocalDate;

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


        System.out.println(curso1);
        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("descriçao da mentoria");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

    }
}