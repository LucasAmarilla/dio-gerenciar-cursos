import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Javao");
    curso1.setCargaHoraria(10);
    curso1.setDescricao("curso de java");

    Curso curso2 = new Curso();
    curso2.setTitulo("Javao2");
    curso2.setCargaHoraria(10);
    curso2.setDescricao("curso de orientado a objetos");

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de java");
    mentoria.setData(LocalDate.now());
    mentoria.setDescricao("escreva java");

    System.out.println(curso1);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp java dev");
    bootcamp.setDescricao("fazer codigo java");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devLucas = new Dev();
    devLucas.setNome("Lucas");
    devLucas.increverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos: "+ devLucas.getConteudosInscritos());
    devLucas.progredir();
    System.out.println("Conteudos finalizados: "+ devLucas.getConteudosConcluidos());
    System.out.printf("XP: " + devLucas.calcularTotalXp());

        System.out.println("---------------");

    Dev devJoaozinho = new Dev();
    devJoaozinho.setNome("Joaozinho");
    devJoaozinho.increverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos: "+ devJoaozinho.getConteudosInscritos());
    System.out.println("Conteudos finalizados: "+ devJoaozinho.getConteudosConcluidos());
    System.out.printf("XP: " + devLucas.calcularTotalXp());




    }
}
