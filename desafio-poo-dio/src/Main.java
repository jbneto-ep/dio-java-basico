import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
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

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setdata(LocalDate.now());

   /* System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);*/

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devNeto = new Dev();
    devNeto.setNome("Neto");
    devNeto.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos Neto:" + devNeto.getConteudosInscritos());
    devNeto.progredir();
    devNeto.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos Neto:" + devNeto.getConteudosInscritos());
    System.out.println("Conteudos Concluidos Neto:" + devNeto.getConteudosConcluidos());
    System.out.println("XP:" + devNeto.calcularXP());

    System.out.println("-----------------");

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir(); 
    System.out.println("-");
    System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
    System.out.println("Conteudos Concluidos João:" + devJoao.getConteudosConcluidos());
    System.out.println("XP:" + devJoao.calcularXP());

    }
}