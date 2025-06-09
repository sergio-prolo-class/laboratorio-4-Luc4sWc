package domain;

import java.util.HashSet;
import java.util.Set;

public class Senior extends CLT{
    private double bonificacao;
    private Set<Premium> representados;
    private Set<Pleno> subordinados;

    public Senior (String nome, String cpf, String sobrenome, String carteiraTrabalho, Set<String> habilidades, double bonificacao,String endereco, double salario,int cargaHoraria ,String...email){
        super(nome,sobrenome,cpf,habilidades,endereco,salario,cargaHoraria,carteiraTrabalho,email);

        this.bonificacao = bonificacao;
        this.representados = new HashSet<>();
        this.subordinados = new HashSet<>();
    }

    public boolean addSubordinados(Pleno subordinado){
        return subordinados.add(subordinado);
    }

    public boolean addRepresentados(Premium representado){
        return representados.add(representado);
    }
}
