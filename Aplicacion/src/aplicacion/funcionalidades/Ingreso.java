package aplicacion.funcionalidades;

import javax.swing.*;

/**
 * Created by Papa Frita on 31/12/2014.
 */
public class Ingreso extends JFrame {

    // Constructor
    public Ingreso() {
 //    setTitle("Ingreso al sistema");
  //    setResizable(false);
  //    setLayout(null);
        JFrame ventana = new JFrame();
        JPanel panel = new JPanel();
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JButton boton4 = new JButton();
        JButton boton5 = new JButton();

        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();

        etiqueta.setText("Contabilidad");
        etiqueta2.setText("Operaciones avanzadas");

        boton1.setText("Stock");
        boton2.setText("Datos");
        boton3.setText("Informes Generales");
        boton4.setText("Parametros Generales");
        boton5.setText("Herramientas Avanzadas");

        panel.add(etiqueta);
        panel.add (boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(etiqueta2);
        panel.add(boton4);
        panel.add(boton5);

        ventana.add (panel);
        ventana.setSize(800, 600);
        ventana.setTitle("Pantalla Principal");
        ventana.setVisible(true);
     //   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
