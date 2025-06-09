package domain;

import java.util.Set;

public class Junior extends CLT{
    //associação com o pleno
    private Pleno orientador;

    public Junior (String nome, String sobrenome, String cpf, Set<String> habilidades , String endereco, double salario, int cargaHoraria, String carteiraTrabalho, String... email){
        super(nome,sobrenome,cpf,habilidades,endereco,salario,cargaHoraria,carteiraTrabalho,email);


    }
}
