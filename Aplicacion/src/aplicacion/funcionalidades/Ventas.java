package aplicacion.funcionalidades;

import javax.swing.*;

/**
 * Created by Papa Frita on 09/01/2015.
 */
public class Ventas extends JFrame {

    // Se declaran los elementos graficos que apareceran en la ventana
    JLabel txtInfo;
    JLabel txtOperacion;
    JLabel txtComprobante;
    JLabel txtInformes;
    JComboBox cmbOperacion;
    JComboBox cmbComprobante;
    JComboBox cmbInforme;
    JButton btnOperacion;
    JButton btnComprobante;
    JButton btnInforme;
    JButton btnConfig;

    // CONSTRUCTOR
    public Ventas() {

    // 1) CUESTIONES GENERALES
        // Se define el titulo de la ventana
        setTitle("Ventas");
        // No permite estirar ventana
        setResizable(false);
        setSize(700, 400);
        // Sin uso de plantilla de distribucion de elementos
        setLayout(null);
        // Cuando cierra se saca el proceso de ejecucion
       // this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    // 2) DEFINICION DE OBJETOS
        txtInfo = new JLabel("Ingrese la opcion deseada:");
        txtOperacion = new JLabel("Operaciones:");
        txtComprobante = new JLabel("Comprobantes:");
        txtInformes = new JLabel("Informes:");

        cmbOperacion = new JComboBox();
        cmbComprobante = new JComboBox();
        cmbInforme = new JComboBox();

        btnOperacion = new JButton("Acceder");
        btnComprobante = new JButton("Acceder");
        btnInforme = new JButton("Acceder");
        btnConfig = new JButton("Configuracion");
/*
        // Definicion de propiedades de los objetos ???????
        botonConfig.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        botonConfig.setVerticalTextPosition(SwingConstants.BOTTOM);
        botonConfig.setToolTipText("Ingresa a panel de configuracion");
*/
    // 3) AGREGADO DE OBJETOS
        add(txtInfo);
        add(txtOperacion);
        add(txtComprobante);
        add(txtInformes);

        add(cmbOperacion);
        add(cmbComprobante);
        add(cmbInforme);

        add(btnOperacion);
        add(btnComprobante);
        add(btnInforme);
        add(btnConfig);

    // 4) UBICACION DE OBJETOS
        txtInfo.setBounds(250, 50, 200, 25);
        txtOperacion.setBounds(100, 100, 100, 25);
        txtComprobante.setBounds(100, 150, 100, 25);
        txtInformes.setBounds(100, 200, 100, 25);

        cmbOperacion.setBounds(200, 100, 250, 25);
        cmbComprobante.setBounds(200, 150, 250, 25);
        cmbInforme.setBounds(200, 200, 250, 25);

        btnOperacion.setBounds(500, 100, 100, 25);
        btnComprobante.setBounds(500, 150, 100, 25);
        btnInforme.setBounds(500, 200, 100, 25);
        btnConfig.setBounds(250, 250, 150, 25);


    // OTROS
        // Centra la ventana
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


}
