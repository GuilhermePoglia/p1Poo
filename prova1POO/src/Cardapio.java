public class Cardapio {
    private String menu;

    public Cardapio(String menu){
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Cardapio: " + menu;
    }
    
}
