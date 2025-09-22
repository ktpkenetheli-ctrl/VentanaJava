import javax.swing.*;  
import java.awt.event.*;  

public class Interfaz {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Interfazzzzz");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Click");
        boton.setBounds(100, 70, 100, 30);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Boton presionado!");
            }
        });

        ventana.setLayout(null);
        ventana.add(boton);

        ventana.setVisible(true);
    }
}