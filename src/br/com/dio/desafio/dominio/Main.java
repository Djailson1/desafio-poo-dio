package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =  new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDjailson = new Dev();
        devDjailson.setNome("Djailson");
        devDjailson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Djailson: " + devDjailson.getConteudosInscritos());
        devDjailson.progredir();
        devDjailson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Djailson: " + devDjailson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Djailson: " + devDjailson.getConteudoConcluido());
        System.out.println("XP:" + devDjailson.calcularTotalXp());

        System.out.println("--------");


        Dev devVinicios = new Dev();
        devVinicios.setNome("Vinícios");
        devVinicios.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Vinícios" + devVinicios.getConteudosInscritos());
        devVinicios.progredir();
        devVinicios.progredir();
        devVinicios.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Vinícios" + devVinicios.getConteudosInscritos());
        System.out.println("Conteúdos Conteúdos Vinícios" + devVinicios.getConteudoConcluido());
        System.out.println("XP:" + devVinicios.calcularTotalXp());




    }
}
