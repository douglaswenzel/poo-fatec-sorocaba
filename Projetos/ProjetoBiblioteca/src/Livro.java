/**
 *
 * @author Douglas Wenzel
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro(int identificacao, String titulo){
        this.identificacao = identificacao;
        this.titulo = titulo;
    }
    
    public void setValMultaDiaria(double Valor){
        this.valMultaDiaria = Valor;
    }
    
    public int getIdentificacao(){
     return(this.identificacao);   
    }
    
    public String getTitulo(){
        return(this.titulo);
    }
    
    public boolean getSituacao(){
        return(this.situacao);
    }
    
    public void emprestar() {
        this.situacao = true;
    }
    
    public double devolver(int diasAtraso){
        this.situacao = false;
        double multa = diasAtraso * this.valMultaDiaria;
        return(multa);
    }
}
