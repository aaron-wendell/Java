import java.util.Arrays;

public class Vetor {
    
    private Aluno[] alunos = new Aluno[4];
    private int totalalunos = 0;

    public void adicionar(Aluno aluno){
        this.garanteEspaco();
        this.alunos[totalalunos] = aluno;
        totalalunos++;
        /*for(int i=0; i<alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }*/
    }

    private boolean posicaoValida(int posicao){
        return posicao >=0 && posicao <= totalalunos;
    }

    public void adicionar(int posicao, Aluno aluno){
        this.garanteEspaco();
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        for(int i = totalalunos-1; i>=posicao; i--){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalalunos++;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >=0 && posicao < totalalunos;
    }

    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return alunos[posicao];
    }

    public void remover(int posicao){
        for(int i = posicao; i<this.totalalunos; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        totalalunos--;
    }

    private void garanteEspaco(){
        if(totalalunos == alunos.length){
            Aluno[] novoarray = new Aluno[alunos.length*2];
            for(int i=0; i<totalalunos; i++){
                novoarray[i] = alunos[i];
            }
            this.alunos = novoarray;
            
        }
    }

    public boolean contem(Aluno aluno){
        for(int i=0; i<totalalunos; i++){
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalalunos;
    }

    public String toString(){
        return Arrays.toString(alunos);
    }
    
}
