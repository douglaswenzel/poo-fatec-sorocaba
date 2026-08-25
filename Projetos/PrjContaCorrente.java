package prjcontacorrente;

/**
 *
 * @author Douglas Wenzel
 */

public class PrjContaCorrente {
            private int numero;
            private double saldo;
            
    public PrjContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

        public int getNumero() {
            return(numero);
        }

        public void depositar(double valor){
            if (saldo <= 0) {
                System.out.println("O saldo deve ser maior que zero. Busca por linhas de crédito? Consulte um de nossos especialistas, rs!");
            } else {
                this.saldo = valor;
                System.out.println("Valor sacado com sucesso! Seu saldo atual é de: R$" + this.saldo);
            }
        }
        
        public double getSaldo() {
            return(saldo);
        }
        
        
    }
    
}
