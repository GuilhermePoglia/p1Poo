public class Vagao {
    private int identificador;
    private String descricao;
    private double capacidadeCarga;
    private static int proxIdent = 1;

    public Vagao(String descricao, double capacidadedeCarga){
        this.identificador = proxIdent;
        this.descricao = descricao;
        this.capacidadeCarga = capacidadedeCarga;
        proxIdent = proxIdent +1;
    }

    public Vagao(){
        this.identificador = proxIdent;
        this.descricao = "padrão";
        this.capacidadeCarga = 5000.0;
        proxIdent = proxIdent +1;
        
    }
    public static int getProxIdent(){
        return proxIdent;
    }

    public int getIdentificador(){
        return identificador;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setTrem(int id){
        this.identificador = id;
    }
    @Override
    public String toString() {
        return "Trem: identificador: " + identificador + ", descricao: " + descricao + ", capacidadeCarga="
                + capacidadeCarga + "]";
    }

}
