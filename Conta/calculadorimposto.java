public class calculadorimposto {
    
    private double total; 

    public void registra(tributavel t){
        double valor = t.getImposto();
        this.total += valor;
    }

    public double getImposto(){
        return total;
    }
}
