public class VagaoResfriado extends Vagao{
    private int temp;

    public VagaoResfriado(String descricao, int capacidadeCarga, int temp){
        super(descricao, capacidadeCarga);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString()+", temperatura: "+ temp;
    }
    
    
}
