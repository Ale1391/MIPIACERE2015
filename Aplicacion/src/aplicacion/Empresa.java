package aplicacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/** comentado los referente al click*/

public class Empresa extends JFrame /*implements ActionListener*/ {

    JLabel txtopbasicas;
    JLabel txtcontabilidad;
    JLabel txtopavanzadas;
    JButton btnventas;
    JButton btncompras;
    JButton btncobranzas;
    JButton btnpagos;
    JButton btnstock;
    JButton btndatos;
    JButton btninformes;
    JButton btnparametros;
    JButton btnconfiguracion;
    JButton btnherramientas;

    // Constructor
    public Empresa()
    {
        ventana_de_ingreso();
    }

    private void ventana_de_ingreso(){

        setTitle("Empresa");                           // titulo de la ventana
        setResizable(false);                           // No permite estirar ventana
        setSize(750, 400);                             // tamaño de la ventana
        setLayout(null);                               // no se usan plantilla, acomodo los componentes a mano WASHOOOO
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  // cierra el proceso al cerrar ventana

        /**********************
         DEFINICION DE OBJETOS
         ************************/

        txtopbasicas = new JLabel("Operaciones Basicas");
        txtcontabilidad = new JLabel("Contabilidad");
        txtopavanzadas = new JLabel("Operaciones Avanzadas");
        btnventas = new JButton("Ventas");
        btncompras = new JButton("Compras");
        btncobranzas = new JButton ("Cobranzas");
        btnpagos = new JButton ("Pagos");
        btnstock = new JButton ("Stock");
        btndatos = new JButton ("Datos");
        btninformes = new JButton ("Informes");
        btnparametros = new JButton ("Param. Generales");
        btnconfiguracion = new JButton ("Configuracion");
        btnherramientas = new JButton ("Herramientas");

        /********************
         AGREGADO DE OBJETOS
         ********************/
        add(txtopbasicas);
        add(txtcontabilidad);
        add(txtopavanzadas);
        add(btnventas);
        add(btncompras);
        add(btncobranzas);
        add(btnpagos);
        add(btnstock);
        add(btndatos);
        add(btninformes);
        add(btnparametros);
        add(btnconfiguracion);
        add(btnherramientas);

        /****************************
         UBICACION DE OBJETOS
         ****************************/
        txtopbasicas.setBounds(100, 50, 150, 25);
        txtcontabilidad.setBounds(300, 50, 100, 25);
        txtopavanzadas.setBounds(500, 50, 150, 25);

        btnventas.setBounds(100,100,150,25);
        btncompras.setBounds(100, 150, 150, 25);
        btncobranzas.setBounds(100, 200, 150, 25);
        btnpagos.setBounds(100, 250, 150, 25);

        btnstock.setBounds(300,100,150,25);
        btndatos.setBounds(300,150,150,25);
        btninformes.setBounds(300,200,150,25);
        btnparametros.setBounds(300,250,150,25);

        btnconfiguracion.setBounds(500,100,150,25);
        btnherramientas.setBounds(500,150,150,25);

        //this.setLocationRelativeTo(null);               // centro ventana
        this.setVisible(true);                          //hago visible la ventana
    }
/*
    public void actionPerformed (ActionEvent evt){
        JOptionPane.showMessageDialog(this,"entraste a stock");
    }
*/
}