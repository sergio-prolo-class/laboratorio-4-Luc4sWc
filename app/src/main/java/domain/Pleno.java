package domain;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Pleno extends CLT {
    // Associacao com Senior e Junior
    private final Set<Junior> orientados;
    private final Set<Consultor> consultores;
    private Senior chefe;

    public Pleno(String nome, String cpf,
                 String sobreNome, double salario,
                 int cargaHoraria, String carteiraTrabalho,
                 Set<String> habilidades, String... emails) {
        super(nome, cpf, sobreNome, salario, cargaHoraria, carteiraTrabalho, habilidades,emails);
        orientados = new HashSet<>();
        chefe = null;
        consultores = new HashSet<>();
    }

    public boolean addOrietado(Junior junior){
        return orientados.add(junior);
    }


    public boolean addConsultor(Consultor c) {
        return consultores.add(c);
    }

    public Set<Consultor> getConsultores() {
        return Collections.unmodifiableSet(consultores);
    }

    public void setChefe(Senior chefe) {
        this.chefe = chefe;
    }

}