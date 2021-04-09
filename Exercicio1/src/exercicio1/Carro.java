
package exercicio1;

public class Carro {
    private String nome;
    private int ano;
    private double valor;
    private double consumo;
    
    public Carro(){
           this.nome = "";
           this.ano = 0;
           this.valor = 0;
           this.consumo = 0;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public void beberrao(){
           if(consumo<8){
           System.out.println("Este carro consome muito! Faz " +consumo +" Km/litro"); 
           
           }else{
           System.out.println("Este carro consome pouco! Apenas " +consumo +" Km/litro");
           }

    }
    
    public void model(){
    
           System.out.println("Este é um " +nome +" fabricado em "+ano );
           
    }
}
