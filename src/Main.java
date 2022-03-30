import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java","descrição curso java", 8);
        Curso curso2 = new Curso("curso js","descrição curso js",4);

        Mentoria mentoria = new Mentoria("Mentoria de java", "Descrição mentoria java",LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev("joao");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de joao" + dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println();
        System.out.println("Conteudos concluidos de joao" + dev1.getConteudoConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("----------");

        Dev dev2 = new Dev("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de lucas" + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println();
        System.out.println("Conteudos concluidos de lucas" + dev2.getConteudoConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
