
package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro();
        c2 = new Carro();
        c1.setNome("fusca");
        c1.setAno(1979);
        c1.setConsumo(10);
        c1.setValor(8000.99);
        c1.beberrao();
        c1.model();
        c2.setAno(c1.getAno());
        c2.setConsumo(c1.getConsumo());
        c2.setNome(c1.getNome());
        c2.setValor(c1.getValor());
        c2.model();//executa em ordem contrária aou anterior, só para diferenciar
        c2.beberrao();
        
        
    }
    
}
