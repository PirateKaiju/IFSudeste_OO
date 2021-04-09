
package exercicio2;

public class Cachorro {
    private String nome;
    private int idade;
    private String raca;
    private double peso;
    private boolean saude; // true para estado de saude bom, false para estado ruim;
    private double preco;
    

  
    public Cachorro(){
           this.nome = "";
           this.idade = 0 ;
           this.peso = 0;
           this.raca = "";
           this.saude = true;
           this.preco=0;
    
    
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaude() {
        return saude;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void ficha(){
    
    System.out.println("Ficha --------------------\n");
    System.out.println("Nome: "+nome +"\n");
    System.out.println("Idade: "+idade +" anos\n");
    System.out.println("Raca: "+raca +"\n");
    System.out.println("Peso: "+peso +" kg\n");
    if(saude){
    System.out.println("Estado de saude: BOM\n");
    }else{
    System.out.println("Estado de saude: RUIM\n");
    }
    System.out.println("Preco: R$"+preco +"\n");
     System.out.println("-------------------------\n");
    
    
    }
    
    public void desconto(){
    System.out.println("Caso compre o cao hoje, terá 10% de desconto, que resulta em um total de "+(preco-(preco*0.1))+"\n");
    }
    
}
