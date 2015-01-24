package aplicacion.funcionalidades;

import javax.swing.*;

/**
 * Created by Papa Frita on 09/01/2015.
 */
public class Ventas extends JFrame {

    // Se definen los elementos graficos que apareceran en la ventana
    JLabel texto1;
    JButton botonOperacion;
    JButton botonComprobante;
    JButton botonConfig;

    // Constructor
    public Ventas () {

        // Se define el titulo de la ventana
        setTitle("Ventas");
        // No permite estirar ventana
        setResizable(false);
        setSize(900,900);
        // Sin uso de plantilla de distribucion de elementos
        setLayout(null);
        // Cuando cierra se saca el proceso de ejecucion
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Definicion de objetos
        texto1 = new JLabel("Ingrese la opcion deseada:");
        botonConfig = new JButton("Configuracion de compras");
        botonOperacion = new JButton("Registrar operacion");
        botonComprobante = new JButton("Registrar comprobante");

        // Definicion de propiedades de los objetos ???????
        botonConfig.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        botonConfig.setVerticalTextPosition(SwingConstants.BOTTOM);
        botonConfig.setToolTipText("Ingresa a panel de configuracion");

        // Se agregan los elementos a la ventana
        add(texto1);
        add(botonConfig);
        add(botonOperacion);
        add(botonComprobante);

        // Se ubican los elementos en la ventana
        texto1.setBounds(500, 200, 200, 250);
        botonConfig.reshape(20, 30, 200, 230);
        botonOperacion.reshape(20, 30, 200, 230);
        botonComprobante.reshape(20, 30, 200, 230);

    }


}
