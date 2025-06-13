package ifsc.poo;
import domain.clt.*;
import domain.funcionario.*;
import domain.humano.*;

import java.time.LocalDate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Criando habilidades
        Set<String> habilidadesPleno = Set.of("Gestão de Projetos", "Comunicação", "Análise");
        Set<String> habilidadesJunior = Set.of("Java", "SQL");
        Set<String> habilidadesSenior = Set.of("Liderança", "Arquitetura de Sistemas");

        // Criando CLT
        Pleno pleno1 = new Pleno("Maria", "12345678900", "Silva",
                6000.0, 40, "CTPS1234",
                habilidadesPleno, "maria@empresa.com");

        Junior junior1 = new Junior("Carlos", "78945612300", "Oliveira",
                3000.0, 30, "CTPS5678",
                habilidadesJunior, "carlos@empresa.com");

        pleno1.addOrietado(junior1);
        junior1.setOrientador(pleno1);

        Senior senior1 = new Senior("João", "74185296300", "Pereira",
                10000.0, 44, "CTPS9999",
                habilidadesSenior, 2000.0, "joao@empresa.com");

        pleno1.setChefe(senior1);
        senior1.addSubordinado(pleno1);

        // Criando Cliente e Premium
        Cliente cliente1 = new Cliente("Ana", "32165498700", "Souza",
                "Rua das Flores", "99999-999", 'F', "ana@gmail.com");

        Premium premium1 = new Premium("Paulo", "15935748600", "Costa",
                "Av Brasil", "88888-888", 'M',
                299.99, "paulo@gmail.com");

        senior1.addRepresentado(premium1);
        premium1.setRepresentate(senior1);

        // Criando estagiários
        Estagio estagio1 = new Estagio("Luana", "32198765400", "Melo",
                1200.0, 20, "IFSC", true, "luana@ifsc.edu.br");

        TI ti1 = new TI("André", "14725836900", "Monteiro",
                1500.0, 30, "UFSC", false, 5, "Backend", "andre@ufsc.br");

        Administracao adm1 = new Administracao("Beatriz", "45678912300", "Freitas",
                1300.0, 20, "UNISUL", true, "Financeiro", "Apoio geral", "bia@unisul.br");

        // Criando temporários
        Consultor consultor1 = new Consultor("Renato", "95175385200", "Lima",
                LocalDate.of(2025, 12, 31), 8000.0,
                LocalDate.of(2025, 12, 31), 5, "renato@consult.com");
        pleno1.addConsultor(consultor1);

        Tecnico tecnico1 = new Tecnico("Fernanda", "85274196300", "Alves",
                LocalDate.of(2025, 11, 30), 6000.0,
                List.of("Manhã", "Noite"), true, "fernanda@tech.com");

        // Impressões de demonstração
        System.out.println("-- Funcionários CLT --");
        System.out.println("Pleno: " + pleno1.getNome());
        System.out.println("Junior: " + junior1.getNome());
        System.out.println("Senior: " + senior1.getNome());

        System.out.println("\n-- Clientes --");
        System.out.println("Cliente comum: " + cliente1.getNome());
        System.out.println("Cliente premium: " + premium1.getNome());

        System.out.println("\n-- Estágios --");
        System.out.println("Estágio padrão: " + estagio1.getNome());
        System.out.println("TI: " + ti1.getNome() + ", Série: " + ti1.getnSerie());
        System.out.println("Administração: " + adm1.getNome() + ", Setor: " + adm1.getSetor());

        System.out.println("\n-- Temporários --");
        System.out.println("Consultor: " + consultor1.getNome());
        System.out.println("Técnico: " + tecnico1.getNome());

        System.out.println("\n-- Relacionamentos --");
        System.out.println("Junior orientado por: " + junior1.getOrientador().getNome());
        System.out.println("Pleno consultores: " + pleno1.getConsultores().stream().map(Consultor::getNome).toList());
        System.out.println("Premium representado por: " + premium1.getRepresentate().getNome());
    }
}
