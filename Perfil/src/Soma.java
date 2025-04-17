/**Crie uma classe Soma em Java para imprimir no console o resultado da
 * operação 10 + 5. Certifique-se de que o resultado seja exibido sem o
 * uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
 */
public class Soma {
    public static void main(String[] args) {
        System.out.println("O resultado da operação 10 + 5 é: " + (10 + 5));
        //Ou
        int resultado = 10 + 5;
        System.out.println(resultado);
        System.out.println("O resultado da operação 10 + 5 é: " + resultado);
    }
}
