
import CalcJunt.Servicecalc;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class CalcularTeste{



    @Test
    public void deveSomar(){
        //Given
        Servicecalc sm = new Servicecalc();
        //When
       double somar = sm.favorsomar(3,3);
        //Then
        Assertions.assertEquals(6, somar);
    }

    @Test
    public void deveSubtrair(){
        //Given
        Servicecalc sm = new Servicecalc();
        //When
        double subtrair = sm.favorsubtrair(3,3);
        //Then
        Assertions.assertEquals(0, subtrair);
    }

    @Test
    public void deveMultiplicar(){
        //Given
        Servicecalc sm = new Servicecalc();
        //When
        double multiplicar = sm.favormultiplicar(3,3);
        //Then
        Assertions.assertEquals(9, multiplicar);
    }

    @Test
    public void deveDividir(){
        //Given
        Servicecalc sm = new Servicecalc();
        //When
        double dividir = sm.favordividir(3,3);
        //Then
        Assertions.assertEquals(1, dividir);
    }

}
