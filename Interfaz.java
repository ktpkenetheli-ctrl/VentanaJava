import javax.swing.*;  
import java.awt.event.*;  

public class Interfaz {
    public static void main(String[] args) {
        // Crear ventana
        JFrame ventana = new JFrame("Interfazzzzz");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botón
        JButton boton = new JButton("Click");
        boton.setBounds(100, 70, 100, 30);

        // Acción del botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Boton presionado!");
            }
        });

        // Añadir el botón a la ventana
        ventana.setLayout(null);
        ventana.add(boton);

        // Mostrar ventana
        ventana.setVisible(true);
    }
}