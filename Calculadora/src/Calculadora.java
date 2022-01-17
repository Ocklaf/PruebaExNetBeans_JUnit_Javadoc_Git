/**
 * Clase Calculadora que posee dos variables enteras privadas
 * @author José Vte. Falcó
 * @version 33563120W
 */
public class Calculadora {
    private int num1;
    private int num2;

    /**
     * Constructor de la clase calculadora que recibe dos variables enteras
     * @param a Número a para hacer operaciones
     * @param b Número b para hacer operaciones
     */
    public Calculadora(int a, int b) {
        num1 = a;
        num2 = b;
    }

    /**
     * Método suma que realiza la suma de dos números
     * @return Devuleve el resultado de la suma de los dos números
     */
    public int suma() {
        int resul = num1 + num2;
        return resul;
    }

    /**
     * Método resta que realiza la resta de dos números
     * @return Devuelve el resultado de la operación matemática de restar
     */
    public int resta() {
        int resul = num1 - num2;
        return resul;
    }

    /**
     * Métod multiplica que realiza la multiplicación de dos números
     * @return Devuelve el resultado de la multiplicación
     */
    public int multiplica() {
        int resul = num1 * num2;
        return resul;
    }

    /**
     * Método divide que realiza la división de dos números
     * @return Devuelve el resultado de dicha operación
     */
    public int divide() {
        int resul = num1 / num2;
        return resul;
    }
}
