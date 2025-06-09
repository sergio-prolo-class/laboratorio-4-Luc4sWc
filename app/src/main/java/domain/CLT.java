package domain;

import java.util.Set;

public class CLT extends Funcionario{
    private double salario;
    private int cargaHoraria;
    private String carteiraTrabalho;
    private Set<String> habilidades;

    public CLT (String nome, String sobrenome, String cpf, Set<String> habilidades ,String endereco,double salario, int cargaHoraria,String carteiraTrabalho,String... email){
        super(nome,cpf,sobrenome,endereco,email);

        this.habilidades = habilidades;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.carteiraTrabalho = carteiraTrabalho;
    }
}
