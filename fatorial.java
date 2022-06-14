public class fatorial{
    public static void main(String[] args){
        int fat = 1;
        for(int i=0; i<10; i++){
            System.out.println("Fatorial de "+ i +":");
            for(int n=1;n<i; n++){
                System.out.print(n + "x");
                fat = i * n;
            }
            System.out.print(i);
            System.out.println(" = " + fat);
        }
    }
}
