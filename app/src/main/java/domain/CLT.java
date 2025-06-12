package domain;

import java.util.Set;

public class CLT extends Funcionario {
    private double salario;
    private int cargaHoraria;
    private String carteiraTrabalho;
    private Set<String> habilidades;
    private final Set<Estagio> orientados;

    public CLT(String nome, String cpf,
               String sobreNome, double salario,
               int cargaHoraria, String carteiraTrabalho,
               Set<String> habilidades, Set<Estagio> orientados, String... emails) {
        super(nome, cpf, sobreNome, emails);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.carteiraTrabalho = carteiraTrabalho;
        this.habilidades = habilidades;
        this.orientados = orientados;
    }
}