package DIO.exercicio.com;

public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é = " + resultado);
    }

    public static void subtracao(double numero1, double numero2, int i) {

        double resultado = numero1 - numero2;

        System.out.println("A subração de " + numero1 + " - " + numero2 + " é = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A Multiplicação de " + numero1 + " x " + numero2 + " é = " + resultado);
    }

    public static void divisao(double numero1, double numero2, int i) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " / " + numero2 + " é = " + resultado);
    }
}
