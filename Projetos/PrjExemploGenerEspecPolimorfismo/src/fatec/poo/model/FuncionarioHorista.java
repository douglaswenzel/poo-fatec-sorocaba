package fatec.poo.model;

/**
 *
 * @author DouglasWenzel
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdHoraTrab;
    
  public FuncionarioHorista(int r, String n, String dt, double val) {
      super(r, n, dt);
      this.valHorTrab = val;
  }
  
  public void setQtdHroraTrab(int qtd ) {
      this.qtdHoraTrab = qtd;
  }
  
  public double calcSalBruto() {
      return(valHorTrab * qtdHoraTrab);
  }
  
}
