import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cardapio x = new Cardapio("exemplo");
    
        //questao 6 - classes Cardapio e VagaoRestaurante
        VagaoRestaurante v = new VagaoRestaurante("restaurante", 5000, x);

        if(v instanceof VagaoRestaurante){
            System.out.println(v.getCardapio());
        }


        //questão 7
        Vagao a = new Vagao("a", 600);
        Vagao b = new Vagao("b", 800);
        Vagao c = new Vagao("c", 400);
        Vagao d = new Vagao("d", 900);
        Vagao e = new Vagao("e", 900);


        CadastroVagoes lista1 = new CadastroVagoes();
        lista1.cadastra(c);
        lista1.cadastra(a);
        lista1.cadastra(e);
        lista1.cadastra(d);
        lista1.cadastra(b);
        ArrayList<Vagao> lista2 = lista1.getVagaoesPorPeso(500);
        
        
        Collections.sort(lista2, Comparator.comparing(Vagao :: getDescricao));
        
        System.out.println();
        for(Vagao vagao: lista2){
            System.out.println(vagao);
        }
        
    }
    
}
