/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Logic.Order;
import Logic.OrderVisitor;
import Model.BMW;
import Model.Ferrari;
import Model.FerrariOrderBuilder;
import Model.Lamborghini;
import Model.OrderDirector;
import com.sun.java.swing.plaf.windows.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author olixe
 */
public class FerrariView extends JFrame {

    public static final String CREATE_ORDER = "Create Order";
    public static final String REGRESAR = "Regresar";
    public static final String EXIT = "Exit";

    public static final String SI = "Si";
    public static final String NO = "No";

    public static final String LED = "LED";
    public static final String LASER = "Láser";

    public static final String R20 = "20''";
    public static final String R21 = "21''";
    public static final String R22 = "22''";

    public static final String SUPER = "812 SuperFast";
    public static final String SPIDER = "488 Spider";
    public static final String GTC = "GTC4Lusso T";
    public static final String PORTOFINO = "Portofino";

    //Generales
    public OrderManager objOrderManager;

    private JComboBox cmbConvertible;
    private JComboBox cmbReceptorDAB;
    private JComboBox cmbFaros;
    private JColorChooser clcColor;
    private JComboBox cmbRines;

    //Propios
    private JComboBox cmbModelo;
    private JComboBox cmbTapacubos;
    private JComboBox cmbElevadorSus;
    private JComboBox cmbCamaraFrontal;

    private JTextField txtOrderId;
    private JLabel lblOrderId;

    private JLabel lblConvertible, lblReceptorDAB, lblFaros, lblColor, lblRines;
    private JLabel lblModelo, lblTapacubos, lblElevadorSus, lblCamaraFrontal;

    //private OrderVisitor objVisitor;
    public FerrariView(OrderManager inobjOrderManager) {
        super("Ferrari Order");

        //Create the visitor instance
        // objVisitor = new OrderVisitor();
        objOrderManager = inobjOrderManager;
        cmbConvertible = new JComboBox();
        cmbConvertible.addItem(FerrariView.SI);
        cmbConvertible.addItem(FerrariView.NO);

        cmbReceptorDAB = new JComboBox();
        cmbReceptorDAB.addItem(FerrariView.SI);
        cmbReceptorDAB.addItem(FerrariView.NO);

        cmbFaros = new JComboBox();
        cmbFaros.addItem(FerrariView.LED);
        cmbFaros.addItem(FerrariView.LASER);

        clcColor = new JColorChooser();

        cmbRines = new JComboBox();
        cmbRines.addItem(FerrariView.R20);
        cmbRines.addItem(FerrariView.R21);
        cmbRines.addItem(FerrariView.R22);

        cmbModelo = new JComboBox();
        cmbModelo.addItem(FerrariView.SUPER);
        cmbModelo.addItem(FerrariView.SPIDER);
        cmbModelo.addItem(FerrariView.GTC);
        cmbModelo.addItem(FerrariView.PORTOFINO);

        cmbTapacubos = new JComboBox();
        cmbTapacubos.addItem(FerrariView.SI);
        cmbTapacubos.addItem(FerrariView.NO);

        cmbElevadorSus = new JComboBox();
        cmbElevadorSus.addItem(FerrariView.SI);
        cmbElevadorSus.addItem(FerrariView.NO);

        cmbCamaraFrontal = new JComboBox();
        cmbCamaraFrontal.addItem(FerrariView.SI);
        cmbCamaraFrontal.addItem(FerrariView.NO);

        txtOrderId = new JTextField(10);

        lblOrderId = new JLabel("Order ID:");

        lblConvertible = new JLabel("Convertible:");
        lblReceptorDAB = new JLabel("Receptor DAB:");
        lblFaros = new JLabel("Faros:");
        lblColor = new JLabel("Color:");
        lblRines = new JLabel("Rines:");

        lblModelo = new JLabel("Modelo:");
        lblTapacubos = new JLabel("Tapacubos fibra Carbono:");
        lblElevadorSus = new JLabel("Elevador de Suspensión");
        lblCamaraFrontal = new JLabel("Cámara frontal (Dos vistas):");

        //Create the open button
        JButton createOrderButton
                = new JButton(FerrariView.CREATE_ORDER);
        createOrderButton.setMnemonic(KeyEvent.VK_C);

        JButton regresarButton = new JButton(FerrariView.REGRESAR);
        regresarButton.setMnemonic(KeyEvent.VK_R);

        JButton exitButton = new JButton(FerrariView.EXIT);
        exitButton.setMnemonic(KeyEvent.VK_X);

        ButtonHandlerF objButtonHandler = new ButtonHandlerF(this);

        regresarButton.addActionListener(objButtonHandler);
        createOrderButton.addActionListener(objButtonHandler);
        exitButton.addActionListener(new ButtonHandler());

        //For layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel();

        JPanel panel = new JPanel();

        GridBagLayout gridbag2 = new GridBagLayout();
        panel.setLayout(gridbag2);
        GridBagConstraints gbc2 = new GridBagConstraints();
        panel.add(regresarButton);
        panel.add(createOrderButton);
        panel.add(exitButton);
        gbc2.anchor = GridBagConstraints.EAST;
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gridbag2.setConstraints(regresarButton, gbc2);
        gbc2.gridx = 1;
        gbc2.gridy = 0;
        gridbag2.setConstraints(createOrderButton, gbc2);
        gbc2.gridx = 2;
        gbc2.gridy = 0;
        gridbag2.setConstraints(exitButton, gbc2);

        //****************************************************
        GridBagLayout gridbag = new GridBagLayout();
        buttonPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();

        buttonPanel.add(lblOrderId);
        buttonPanel.add(txtOrderId);

        buttonPanel.add(cmbConvertible);
        buttonPanel.add(cmbReceptorDAB);
        buttonPanel.add(cmbFaros);
        //buttonPanel.add(clcColor);
        buttonPanel.add(cmbRines);

        buttonPanel.add(cmbModelo);
        buttonPanel.add(cmbTapacubos);
        buttonPanel.add(cmbElevadorSus);
        buttonPanel.add(cmbCamaraFrontal);

        buttonPanel.add(lblConvertible);
        buttonPanel.add(lblReceptorDAB);
        buttonPanel.add(lblFaros);
        buttonPanel.add(lblColor);
        buttonPanel.add(lblRines);
        buttonPanel.add(lblModelo);
        buttonPanel.add(lblTapacubos);
        buttonPanel.add(lblElevadorSus);
        buttonPanel.add(lblCamaraFrontal);

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblOrderId, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(txtOrderId, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblConvertible, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(cmbConvertible, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblReceptorDAB, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(cmbReceptorDAB, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gridbag.setConstraints(lblFaros, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 3;
        gridbag.setConstraints(cmbFaros, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gridbag.setConstraints(lblColor, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gridbag.setConstraints(clcColor, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gridbag.setConstraints(lblRines, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gridbag.setConstraints(cmbRines, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gridbag.setConstraints(lblModelo, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 6;
        gridbag.setConstraints(cmbModelo, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 7;
        gridbag.setConstraints(lblTapacubos, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 7;
        gridbag.setConstraints(cmbTapacubos, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 8;
        gridbag.setConstraints(lblElevadorSus, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 8;
        gridbag.setConstraints(cmbElevadorSus, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 9;
        gridbag.setConstraints(lblCamaraFrontal, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 9;
        gridbag.setConstraints(cmbCamaraFrontal, gbc);

        gbc.insets.left = 2;
        gbc.insets.right = 2;
        gbc.insets.top = 40;

        //****************************************************
        //Add the buttons and the log to the frame
        Container contentPane = getContentPane();

        contentPane.add(buttonPanel, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
            SwingUtilities.updateComponentTreeUI(
                    FerrariView.this);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public String getOrderID() {
        return txtOrderId.getText();
    }

    public String getCmbConvertible() {
        return (String) cmbConvertible.getSelectedItem();
    }

    public String getCmbReceptorDAB() {
        return (String) cmbReceptorDAB.getSelectedItem();
    }

    public String getCmbFaros() {
        return (String) cmbFaros.getSelectedItem();
    }

    public String getCmbRines() {
        return (String) cmbRines.getSelectedItem();
    }

    public String getCmbModelo() {
        return (String) cmbModelo.getSelectedItem();
    }

    public String getCmbTapacubos() {
        return (String) cmbTapacubos.getSelectedItem();
    }

    public String getCmbElevadorSus() {
        return (String) cmbElevadorSus.getSelectedItem();
    }

    public String getCmbCamaraFrontal() {
        return (String) cmbCamaraFrontal.getSelectedItem();
    }

} // End of class FerrariView

class ButtonHandlerF implements ActionListener {

    FerrariView objFerrariView;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(FerrariView.EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(FerrariView.CREATE_ORDER)) {
            //Capturar Atributos
            int orderId = Integer.parseInt(objFerrariView.getOrderID());
            boolean convertible = objFerrariView.getCmbConvertible().equals(FerrariView.SI);
            boolean receptorDAB = objFerrariView.getCmbReceptorDAB().equals(FerrariView.SI);
            String faros = objFerrariView.getCmbFaros();
            //String color = objLamborghiniView.
            String rines = objFerrariView.getCmbRines();
            String modelo = objFerrariView.getCmbModelo();
            boolean tapacubos = objFerrariView.getCmbTapacubos().equals(FerrariView.SI);
            boolean elevadorSus = objFerrariView.getCmbElevadorSus().equals(FerrariView.SI);
            boolean camaraFrontal = objFerrariView.getCmbCamaraFrontal().equals(FerrariView.SI);

            System.out.println(orderId + "\n" + convertible + "\n"
                    + receptorDAB + "\n" + faros + "\n" + rines + "\n" + modelo
                    + "\n" + tapacubos + "\n" + elevadorSus + "\n" + camaraFrontal);
            
            FerrariOrderBuilder builderFerrari = FerrariOrderBuilder.getFerrariOrderBuilder();
            OrderDirector orderDirector = new OrderDirector(builderFerrari);
            orderDirector.agregarVehiculo(orderId,convertible,receptorDAB,faros,rines,modelo,tapacubos,elevadorSus,camaraFrontal);
            
        }

        if (e.getActionCommand().equals(FerrariView.REGRESAR)) {
            objFerrariView.setVisible(false);
            objFerrariView.objOrderManager.setVisible(true);
        }
    }

    public ButtonHandlerF() {
    }

    public ButtonHandlerF(FerrariView inObjFerrariView) {
        objFerrariView = inObjFerrariView;
    }

} // End of class ButtonHandler

