
import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);             
       int opcao;
       double medRaio;
       String unidade;
       
       System.out.print("Digite a unidade de medida: ");   
       unidade = entrada.next();
      
       Circulo objCirc = new Circulo(unidade);
       
       System.out.print("Digite a medida da raio: ");              
       medRaio = entrada.nextDouble();               
      
       objCirc.setRaio(medRaio);
                                               
       do {
            System.out.println("\n\n1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar Diâmetro");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opcão: ");
            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("\n\nMedida do raio: " + objCirc.getRaio() +
                                    objCirc.getUnidadeMedida());
                
                if (opcao == 1) {
                    System.out.println("\nMedida da área: " + objCirc.calcArea()+
                                       objCirc.getUnidadeMedida() + "²");
                } else if (opcao == 2) {
                    System.out.println("\nMedida do perímetro: " + objCirc.calcPerimetro()+
                                       objCirc.getUnidadeMedida());
                } else if (opcao == 3) {
                    System.out.println("\nMedida do diâmetro: " + objCirc.calcDiametro()+
                                       objCirc.getUnidadeMedida());
                }
            }
        } while (opcao < 4);
    }    
}
