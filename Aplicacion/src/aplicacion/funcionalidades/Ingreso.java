package aplicacion.funcionalidades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by Papa Frita on 31/12/2014.
 */
public class Ingreso extends JFrame implements ActionListener {

    JFrame ventana;
    JPanel panel;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    JLabel etiqueta1;
    JLabel etiqueta2;

    // Constructor
    public Ingreso() {
        gui();
    }

    private void gui(){

        ventana = new JFrame();
        panel   = new JPanel();
        boton1  = new JButton("Stock");
        boton2  = new JButton("Datos");
        boton3  = new JButton("Informes Generales");
        boton4  = new JButton("Parametros Generales");
        boton5  = new JButton("Herramientas Avanzadas");

        etiqueta1 = new JLabel();
        etiqueta2 = new JLabel();

        etiqueta1.setText("Contabilidad");
        etiqueta2.setText("Operaciones avanzadas");

        panel.add(etiqueta1);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(etiqueta2);
        panel.add(boton4);
        panel.add(boton5);

        boton1.addActionListener(this);

        ventana.add (panel);
        ventana.setSize(800, 600);
        ventana.setTitle("Pantalla Principal");
        ventana.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //    setTitle("aplicacion.funcionalidades.Ingreso al sistema");
        //    setResizable(false);
        //    setLayout(null);
    }

    public void actionPerformed (ActionEvent evt){
        JOptionPane.showMessageDialog(this,"entraste a stock");
    }
}
