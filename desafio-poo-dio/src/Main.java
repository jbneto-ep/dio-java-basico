import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main{
public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso javaScript");
    curso2.setDescricao("descrição curso javaScript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("mentoria de java");
    mentoria1.setDescricao("descrição mentoria java");
    mentoria1.setdata(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);

    System.out.println(mentoria1);
}
}