public class condicionais {
    public static void main(String[] args) {
        double salario = 3300.0;
        double ir; 
        if(salario<1900)
            ir = 0;
        else if(salario<=2800){
            ir = 142;
        }
        else if(salario<=3751.0){
            ir = 350;
        }
        else if(salario<=4664.0){
            ir = 636;
        }
        else{
            ir = 1000;
        }
        System.out.println("Salario = R$"+ salario + " com isso o Imposto de renda = R$"+ ir);
    }
}
