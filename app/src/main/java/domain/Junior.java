package domain;

import java.util.Set;

public class Junior extends CLT{
    private Pleno orientador;

    public Junior(String nome, String cpf, String sobreNome,
                  double salario, int cargaHoraria,
                  String carteiraTrabalho,
                  Set<String> habilidades, String... emails) {
        super(nome, cpf, sobreNome, salario, cargaHoraria, carteiraTrabalho, habilidades, emails);
        orientador = null;
    }

    public void setOrientador(Pleno orientador) {
        this.orientador = orientador;
    }
}