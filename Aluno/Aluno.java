public class Aluno {
    public int id;
    public String nome;
    public int idade;
    public double p1;
    public double p2;
    public double nf;

    public Aluno(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public void setNotaFinal(double p1, double p2){
        this.p1 = p1;
        this.p2 = p2;
        this.nf = (p1+p2)/2;
        System.out.println("Nota final de "+this.nome+": "+nf);
    }

    public double getNotaFinal(){
        return this.nf;
    }

    public void dados(){
        System.out.println("Dados de "+this.nome+":\nID: "+this.id+"\nIdade: "+idade+"\nNota da prova 1: "+p1+"\nNota da prova 2: "+ p2 +
        "\nNota Final: "+this.getNotaFinal());
    }
}
