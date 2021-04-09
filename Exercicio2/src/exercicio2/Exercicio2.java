
package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
 
        Cachorro x1, x2;
        x1 = new Cachorro();
        x2 = new Cachorro();
        
        x1.setNome("Madruguinha");
        x1.setIdade(2);
        x1.setPeso(3);
        x1.setRaca("Vira-lata");
        x1.setSaude(true);
        x1.setPreco(31);
        x1.ficha();
        x1.desconto();
        
        x2.setIdade(x1.getIdade());
        x2.setPeso(x1.getPeso());
        x2.setSaude(x1.isSaude());
        x2.setPreco(x1.getPreco());
        x2.setNome("Rex");
        x2.setRaca("Pastor");
        x2.ficha();
        x2.desconto();
        
        System.out.println("Tenha um bom dia!");
    }
    
}
