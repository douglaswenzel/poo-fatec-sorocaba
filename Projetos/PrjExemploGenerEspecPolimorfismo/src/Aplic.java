
import fatec.poo.model.FuncionarioHorista;

public class Aplic {
    
    public static void main(String args[]){
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1020, "Douglas Wenzel", "15/03/2002", 19.80);
        
        funcHor.setQtdHroraTrab(120);
        
        System.out.println("Salário Bruto => " + funcHor.calcSalBruto());
        System.out.println("Descontos => " + funcHor.calcDesconto());
        System.out.println("Salário Líquido => " + funcHor.calcSalLiquido());
               
    }
    
}
