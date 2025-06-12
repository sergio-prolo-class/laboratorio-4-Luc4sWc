package domain;

import domain.Senior;

import java.time.LocalDate;

public class Premium extends Cliente {
    private double pgmtMensal;
    private LocalDate dataInicioPremium;
    private Senior representate;

    public Premium(String nome, String cpf,
                   String sobreNome, String endereco,
                   String telefone, char genero,
                   double  pgmtMensal, String... emails) {
        super(nome, cpf, sobreNome, endereco, telefone, genero, emails);
        this.pgmtMensal = pgmtMensal;
        this.dataInicioPremium = LocalDate.now();
        representate = null;
    }

    public void setRepresentate(Senior representate) {
        this.representate = representate;
    }
}
