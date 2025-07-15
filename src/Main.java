import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Orientação a objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java Lambda");
        curso2.setDescricao("Utilizando lambda no Java ");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria curso de java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de java ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devKaique = new Dev();
        devKaique.setNome("Kaique");
        devKaique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Kaique" + devKaique.getConteudosInscritos());
        devKaique.progredir();
        devKaique.progredir();
        devKaique.progredir();
        System.out.println("===========================================");
        System.out.println("Conteudos inscritos Kaique" + devKaique.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Kaique" + devKaique.getConteudosConcluidos());
        System.out.println("XP:::" + devKaique.calcularTotalXp());


        System.out.println("##################################################################");


        Dev devNikolas = new Dev();
        devNikolas.setNome("Nikolas");
        devNikolas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Nikolas" + devNikolas.getConteudosInscritos());
        devNikolas.progredir();
        System.out.println("===========================================");
        System.out.println("Conteudos inscritos Nikolas" + devNikolas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Nikolas" + devNikolas.getConteudosConcluidos());
        System.out.println("XP:::" + devNikolas.calcularTotalXp());


    }
}