package domain;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private static int countTotal;

    static{
        countTotal = 0;
    }

    private int id;
    private LocalDate dataInicioContrato;

    public Funcionario (String nome,String cpf, String sobrenome, String endereco, String... email){
        super(nome,sobrenome,cpf,email);

        this.id = ++countTotal;
        this.dataInicioContrato = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Funcionario f)) return false;
        return id == f.id;
    }

    public int hashcode(){return id;}
}
