package domain;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    private static int countTotal;

    static{
        countTotal = 0;
    }

    private int id;
    private String endereco;
    private String telefone;
    private char genero;
    private LocalDate dataCadastro;

    public Cliente (String nome,String cpf, String sobrenome, String endereco, String telefone, char genero, String... email){
        super(nome,sobrenome,cpf,email);

        this.dataCadastro = LocalDate.now();
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.id = ++countTotal;

    }
}
