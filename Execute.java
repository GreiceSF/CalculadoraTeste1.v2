package CalcJunt;

public class Execute {

    public static void main(String[] args) {

        Servicecalc calc = new Servicecalc();
        System.out.println("O resultado da soma e: " + calc.favorsomar(3,3));
        System.out.println("O resultado da subtracao e: " + calc.favorsubtrair(3,3));
        System.out.println("O resultado da multiplicacao e: " + calc.favormultiplicar(3,3));
        System.out.println("O resultado da divisao e: " + calc.favordividir(3,3));


    }
}
