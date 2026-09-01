
import java.util.Scanner;

/**
 *
 * @author Douglas Wenzel
 */
public class Aplic {
   
    public static void mostrarSubmenu(Scanner entrada) {
    while (true) {
        System.out.println("\n1 - Voltar");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        int escolha = entrada.nextInt();
        if (escolha == 1) {
            return;
        } else if (escolha == 0) {
            System.out.println("Saindo...");
            System.exit(0);
        } else {
            System.out.println("Opção invalida! Tente novamente.");
        }
    }
}
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
                
        Livro meuLivro = new Livro(123, "Dom Casmurro");
        
        meuLivro.setValMultaDiaria(3.75);
        
        while (true) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("1 - Consultar Livro");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            System.out.println("Digite a opcao desejada: ");
            
            int opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("ID: " + meuLivro.getIdentificacao());
                    System.out.println("Titulo: " + meuLivro.getTitulo());
                    System.out.println("Situacao: " + (meuLivro.getSituacao() ? "Emprestado" : "Disponivel"));
                    mostrarSubmenu(entrada);
                    break;
                case 2:
                    if (meuLivro.getSituacao()) {
                        System.out.println("O livro ja esta emprestado!");
                    } else {
                        meuLivro.emprestar();
                        System.out.println("Emprestimo realizado com sucesso!");
                    }
                    mostrarSubmenu(entrada);
                    break;
                case 3:
                    
                    if (!meuLivro.getSituacao()) {
                        System.out.println("Esse livro ja esta disponivel!");
                    } else {
                        System.out.println("Quantos dias de atraso?");
                        int dias = entrada.nextInt();
                        double multa = meuLivro.devolver(dias);
                        
                        System.out.println("Devolucao realizada com sucesso!");
                        System.err.println("Multa calculada em: R$" + multa );
                    }
                    mostrarSubmenu(entrada);
                    break;
                case 4:
                     System.exit(0);            
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    
    }
}


