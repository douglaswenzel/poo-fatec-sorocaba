package fatec.poo.model;

/**
 *
 * @author Douglas Wenzel
 */

public abstract class Funcionario {
    
    private int registro;
    private String nome;
    private String dtAdmissao;
    
   public Funcionario(int r, String n, String dt) {
       this.registro = r;
       this.nome = n;
       this.dtAdmissao = dt;
   }
   
   public abstract double calcSalBruto();
   
   public double calcDesconto() {
       return(0.10 * calcSalBruto());
   }
   
   public double calcSalLiquido() {
       return(calcSalBruto() - calcDesconto());
   }
   
}
