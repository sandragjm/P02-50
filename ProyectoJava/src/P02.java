import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Lo primero es declarar dos variables que serán dos números introducidos por el usuario

        System.out.println("Introduce dos numeros positivos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //A continuación, mediante una variable booleana, indicamos al programa que los números deben ser positivos para realizarse la operación

        boolean positivos = (num1 >= 0 && num2 >= 0);

        //Ahora, si (if) los numeros son positivos, el usuario tendrá que indicar qué operación quiere realizar
        //Utilizamos switch para cada símbolo matemático

        if (positivos == true) {

            System.out.println("Introduce la operación deseada");
            String operacion = sc.next();
            switch (operacion) {
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num1 > num2)
                        System.out.println(num1 / num2);
                    else
                        System.out.println(num2 / num1);
                    break;

                //Una vez introducido un simbolo matematico correcto, se efectuará la operación y el proceso habrá terminado
                //En el caso que no sea un símbolo matemático, se indicará que no es correcto con "default"

                default:
                    System.out.println ("No es correcto");
            }
        }

        //En el caso de que los numeros NO sean positivos, el usuario leerá el siguiente mensaje y no se realizará la operación

        else System.out.println("Los numeros no son correctos");
    }
}
