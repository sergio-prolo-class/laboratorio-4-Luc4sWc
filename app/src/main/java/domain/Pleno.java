package domain;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.HashSet;
import java.util.Set;

public class Pleno {
    //associação com o senior e junior
    private final Set<Junior> orientados;
    private Senior chefe;

    public Pleno (String nome, String sobrenome, String cpf, Set<String> habilidades , String endereco, double salario, int cargaHoraria, String carteiraTrabalho, String... email){
        super(nome,sobrenome,cpf,habilidades,endereco,salario,cargaHoraria,carteiraTrabalho,email);

        orientados = new HashSet<>();
        chefe = null;
    }

    public boolean addOrientado(Junior junior){
        return orientados.add(junior);
    }
}
