package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario {
    
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int r, String nome, String dt, double valSal) {
    super(r, nome, dt);
    this.valSalMin = valSal;
    }
    
   public void setNumSalMin(double numSal){
       this.numSalMin = numSal;
   } 
       
   public double calcSalBruto(){
       return(valSalMin * numSalMin);
   }
    
}
