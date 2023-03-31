package numeroperfecto;

import javax.swing.JOptionPane;

public class NumeroPerfecto {
public static void main(String[] args) {
        int numero,suma;
        String dato;
        dato = JOptionPane.showInputDialog(null, "Escriba un numero");
        numero = Integer.parseInt(dato);
        
         perfecto numeroperfecto = new perfecto(numero);
       suma= numeroperfecto.calcular();
       if (suma==numero){
               JOptionPane.showMessageDialog(null, "El numero "  + numero + " perfecto");
       }
       else{
               JOptionPane.showMessageDialog(null,"El numero "  + numero + " no es perfecto");
}
    }
    
}
