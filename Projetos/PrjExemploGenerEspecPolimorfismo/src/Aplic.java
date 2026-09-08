
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {
    
    public static void main(String args[]){
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1020, "Douglas Wenzel", "15/03/2002", 19.80);
        
        funcHor.setQtdHroraTrab(120);
        
        System.out.println("Funcionário: " + funcHor.getNome());
        System.out.println("Salário Bruto => " + funcHor.calcSalBruto());
        System.out.println("Descontos => " + funcHor.calcDesconto());
        System.out.println("Salário Líquido => " + funcHor.calcSalLiquido());
        System.out.println("Data de admissão: " + funcHor.getDtAdmissao());
        
        System.out.println("===================================");
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1034, "Matheus Pierre", "12/05/2025",1820);
        
        funcMen.setNumSalMin(1);
        
        System.out.println("Funcionário: " + funcMen.getNome());
        System.out.println("Salário Bruto MENSALISTA => " + funcMen.calcSalBruto() );
        System.out.println("Descontos => " + funcMen.calcDesconto());
        System.out.println("Salário Líquido => " + funcMen.calcSalLiquido());
        System.out.println("Data de admissão: " + funcMen.getDtAdmissao());
        
    }
    
}
