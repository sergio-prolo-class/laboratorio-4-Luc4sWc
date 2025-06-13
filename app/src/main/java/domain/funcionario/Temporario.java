package domain.funcionario;

import java.time.LocalDate;

public class Temporario extends Funcionario {
   private LocalDate dataTerminoTemporario;
   private double valorTotal;

   public Temporario(String nome, String cpf, String sobreNome, LocalDate dataTerminoTemporario, double valorTotal,String... emails){
      super(nome, cpf, sobreNome, emails);

      this.dataTerminoTemporario = dataTerminoTemporario;
      this.valorTotal = valorTotal;

   }

   public LocalDate getDataTerminoTemporario() {
      return dataTerminoTemporario;
   }

   public double getValorTotal() {
      return valorTotal;
   }
}
