import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero");
        String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero");

        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int resultado = numero1 + numero2;
        int resultado2 = numero1 - numero2;
        int resultado3 = numero2 * numero1;



        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado2);
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado3);
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado4);


    }
}