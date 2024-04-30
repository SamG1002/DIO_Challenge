package Contador;
public class ParametrosInvalidosException extends Exception{
    public static String validarNumeros(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2)
          throw new ParametrosInvalidosException();
          return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
