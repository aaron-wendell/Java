public class tabuada {
    public static void main(String[] args){
        for(int contador=1; contador<11; contador++){
            System.out.println("Tabuada do "+contador+":");
                for(int multiplicador=1; multiplicador<11; multiplicador++){
                    System.out.print(multiplicador+"x"+contador+" = ");
                    System.out.println(multiplicador*contador);
                } 
            System.out.println();
            }
    }
}
