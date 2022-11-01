import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
    int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de un segundo número: "));

        if((numero1 % 2 ==0) && (numero2 % 2 == 0)){
            JOptionPane.showMessageDialog(null,"Ambos números son pares");
        }else if((numero1 % 2 !=0) && (numero2 % 2 != 0)){
            JOptionPane.showMessageDialog(null,"Ambos números son impares");
        }else{
            JOptionPane.showMessageDialog(null, "Un número es par y el otro es impar");
        }
    }
}
