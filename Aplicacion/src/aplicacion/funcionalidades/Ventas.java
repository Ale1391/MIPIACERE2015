package aplicacion.funcionalidades;

import javax.swing.*;

/**
 * Created by Papa Frita on 09/01/2015.
 */
public class Ventas extends JFrame {

    // Se declaran los elementos graficos que apareceran en la ventana
    JLabel txtInfo;
    JButton btnOperacion;
    JButton btnComprobante;
    JButton btnConfig;

    // CONSTRUCTOR
    public Ventas() {

    // 1) CUESTIONES GENERALES
        // Se define el titulo de la ventana
        setTitle("Ventas");
        // No permite estirar ventana
        setResizable(false);
        setSize(700, 700);
        // Sin uso de plantilla de distribucion de elementos
        setLayout(null);
        // Cuando cierra se saca el proceso de ejecucion
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    // 2) DEFINICION DE OBJETOS
        txtInfo = new JLabel("Ingrese la opcion deseada:");
        btnOperacion = new JButton("Registrar operacion");
        btnComprobante = new JButton("Registrar comprobante");
        btnConfig = new JButton("Configuracion de compras");
/*
        // Definicion de propiedades de los objetos ???????
        botonConfig.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        botonConfig.setVerticalTextPosition(SwingConstants.BOTTOM);
        botonConfig.setToolTipText("Ingresa a panel de configuracion");
*/
    // 3) AGREGADO DE OBJETOS
        add(txtInfo);
        add(btnOperacion);
        add(btnComprobante);
        add(btnConfig);

    // 4) UBICACION DE OBJETOS
        txtInfo.setBounds(200, 50, 200, 25);
        btnOperacion.setBounds(200, 100, 150, 25);
        btnComprobante.setBounds(200, 150, 150, 25);
        btnConfig.setBounds(200, 200, 150, 25);


    // OTROS
        // Centra la ventana
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


}
