package domain.funcionario;

import java.time.LocalDate;
import java.util.List;

public class Tecnico extends Temporario {
    private List<String> turnos; // Ex: ["Manhã", "Noite"]
    private boolean necessitaEPI;

    public Tecnico(String nome, String cpf, String sobreNome, LocalDate dataTerminoTemporario, double valorTotal,List<String> turnos, Boolean necessitaEPI,String... emails) {
        super(nome, cpf, sobreNome, dataTerminoTemporario, valorTotal, emails);
        this.turnos = turnos;
        this.necessitaEPI = necessitaEPI;
    }

    public List<String> getTurnos() {
        return turnos;
    }

    public boolean isNecessitaEPI() {
        return necessitaEPI;
    }
}

