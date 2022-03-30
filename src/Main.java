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

        Dev devJoao = new Dev();
        devJoao.setNome("joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos joao" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos joao" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("----------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos lucas" + devLucas.getConteudoInscritos());

        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos lucas" + devLucas.getConteudoConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

    }
}
