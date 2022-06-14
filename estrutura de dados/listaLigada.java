public class listaLigada {
    
    private Celula primeiro = null;
    private Celula ultimo = null;
    private int totalElementos = 0;

    @Override
    public String toString() {
        if(totalElementos == 0){
            return "[]";
        }
        
        Celula atual = primeiro;

        StringBuilder builder = new StringBuilder("[");

        for(int i=0; i<totalElementos; i++){
            builder.append(atual.getElemento());
            if(i != totalElementos-1){
                builder.append("; ");
            }
            atual = atual.getProximo();

        }
        builder.append("]");
        return builder.toString();
    }

    
    public void adicionaComeco(Object elemento){

        if(this.totalElementos==0){
            Celula nova = new Celula(elemento);
            this.primeiro = nova;
            this.ultimo = nova;
        }
        else{
        Celula novo = new Celula(elemento, this.primeiro);
        this.primeiro.setAnterior(novo);
        this.primeiro = novo;
        }
        this.totalElementos++;

    }

    public void adiciona(Object elemento){
        if(this.totalElementos == 0){
            adicionaComeco(elemento);
        }
        else{
            Celula novo = new Celula(elemento);
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            this.totalElementos++;
        }
    }
    
    public void adiciona(int posicao, Object elemento){
        if(posicao==0){
            this.adicionaComeco(elemento);
        }
        else if(posicao == this.totalElementos){
            this.adiciona(elemento);
        }
        else{
            Celula anterior = (Celula) this.pegaCelula(posicao-1);
            Celula proximo = anterior.getProximo();
            
            Celula novo = new Celula(elemento, anterior.getProximo());
            novo.setAnterior(anterior);
            anterior.setProximo(novo);
            proximo.setAnterior(novo);
            this.totalElementos++;
        }
    }
    
    private boolean posicaoOcupado(int posicao){
        return posicao > 0 && posicao < this.totalElementos;
    }

    private Object pegaCelula(int posicao){
        if(!posicaoOcupado(posicao)){
            throw new IllegalArgumentException("Posicao inexistente");
        }
        Celula atual = primeiro;
        for(int i=0; i<posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }
    
    public Object pega(int posicao)
    {
        return ((Celula) this.pegaCelula(posicao)).getElemento();
    }

    public void remove(int posicao){
        if(posicao == 0){
            this.removeComeco();
        }
        else if(posicao == totalElementos){
            this.removeFim();
        }
        else{
            Celula anterior = (Celula) this.pegaCelula(posicao-1);
            Celula atual = anterior.getProximo();
            Celula proximo = atual.getProximo();

            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            
            this.totalElementos--;
        }
    }
    
    public void removeComeco(){
        if(this.totalElementos == 0){
            throw new IllegalArgumentException("Lista vazia");
        }
        this.primeiro = this.primeiro.getProximo();
        this.totalElementos--;

        if(this.totalElementos == 0){
            this.ultimo = null;
        }
    }

    public void removeFim(){
        if(this.totalElementos == 1){
            this.removeComeco();
        }
        else{
            Celula penultimo = this.ultimo.getAnterior();
            penultimo.setProximo(null);
            this.ultimo = penultimo;
            this.totalElementos--;
        }
    }

    public int tamanho(){
        return this.totalElementos;
    }

    public boolean contem(Object objeto){
        Celula atual = this.primeiro;
        
        while(atual != null){
            if(atual.getElemento().equals(objeto)){
                return true;
            }
            atual = atual.getProximo();
        }
        
        return false;
    }

}
