
import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Teste");
        curso1.setDescricao("Curso de teste");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Teste 2");
        curso2.setDescricao("Curso de teste 2");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Teste");
        mentoria.setDescricao("Mentoria de teste");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Teste");
        bootcamp.setDescricao("Bootcamp de teste");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        devFulano.progredir();

        Dev devSicrano = new Dev();
        devSicrano.setNome("Sicrado");
        devSicrano.inscreverBootcamp(bootcamp);

        System.out.println("Fulano | XP: " + devFulano.calcularXp() );
        System.out.println("Inscrito " + bootcamp.getConteudos());
        System.out.println("Faltando " + devFulano.getConteudoInscrito());
        System.out.println("Concluido " + devFulano.getConteudoConcluido());

        System.out.println("Sicrano | XP: " + devSicrano.calcularXp() );
        System.out.println("Inscrito " + bootcamp.getConteudos());
        System.out.println("Faltando " + devSicrano.getConteudoInscrito());
        System.out.println("Concluido " + devSicrano.getConteudoConcluido());
    }
}
