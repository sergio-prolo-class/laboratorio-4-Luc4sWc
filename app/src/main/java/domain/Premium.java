package domain;

import java.time.LocalDate;

public class Premium extends Cliente{
    private double pagMensal;
    private LocalDate dataInicioPremium;
    //funcionario representante
    private Senior representante;

    public Premium (String nome,String cpf, String sobrenome, String endereco, String telefone, char genero, String email, double pagMensal){
        super(nome, cpf, sobrenome, endereco, telefone,genero,email);
        this.pagMensal = pagMensal;
        this.dataInicioPremium = LocalDate.now();
        this.representante = null;

    }
}
