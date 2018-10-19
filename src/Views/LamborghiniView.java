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
import Model.Lamborghini;
import Model.LamborghiniOrderBuilder;
import com.sun.java.swing.plaf.windows.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author olixe
 */
public class LamborghiniView extends JFrame {

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

    public static final String URUS = "Urus";
    public static final String HURACAN = "Huracán";
    public static final String AVENTADOR = "Aventador";
    public static final String FEW = "Few Off";
    public static final String CONCEPT = "Concept";
    public static final String AD = "Ad";
    public static final String PERSONAM = "Personam";

    public OrderManager objOrderManager;
    //Generales
    private JComboBox cmbConvertible;
    private JComboBox cmbReceptorDAB;
    private JComboBox cmbFaros;
    private JColorChooser clcColor;
    private JComboBox cmbRines;

    //Propios
    private JComboBox cmbModelo;
    private JComboBox cmbSuspensionMR;
    private JComboBox cmbSEDeportivo;
    private JComboBox cmbTelemetriaL;

    private JTextField txtOrderId;
    private JLabel lblOrderId;

    private JLabel lblConvertible, lblReceptorDAB, lblFaros, lblColor, lblRines;
    private JLabel lblModelo, lblSuspensionMR, lblSEDeportivo, lblTelemetriaL;

    //private OrderVisitor objVisitor;
    public LamborghiniView(OrderManager inObjOrderManager) {
        super("Lamborghini Order");

        //Create the visitor instance
        // objVisitor = new OrderVisitor();
        objOrderManager = inObjOrderManager;
        cmbConvertible = new JComboBox();
        cmbConvertible.addItem(LamborghiniView.SI);
        cmbConvertible.addItem(LamborghiniView.NO);

        cmbReceptorDAB = new JComboBox();
        cmbReceptorDAB.addItem(LamborghiniView.SI);
        cmbReceptorDAB.addItem(LamborghiniView.NO);

        cmbFaros = new JComboBox();
        cmbFaros.addItem(LamborghiniView.LED);
        cmbFaros.addItem(LamborghiniView.LASER);

        clcColor = new JColorChooser();

        cmbRines = new JComboBox();
        cmbRines.addItem(LamborghiniView.R20);
        cmbRines.addItem(LamborghiniView.R21);
        cmbRines.addItem(LamborghiniView.R22);

        cmbModelo = new JComboBox();
        cmbModelo.addItem(LamborghiniView.URUS);
        cmbModelo.addItem(LamborghiniView.HURACAN);
        cmbModelo.addItem(LamborghiniView.AVENTADOR);
        cmbModelo.addItem(LamborghiniView.FEW);
        cmbModelo.addItem(LamborghiniView.CONCEPT);
        cmbModelo.addItem(LamborghiniView.AD);
        cmbModelo.addItem(LamborghiniView.PERSONAM);

        cmbSuspensionMR = new JComboBox();
        cmbSuspensionMR.addItem(LamborghiniView.SI);
        cmbSuspensionMR.addItem(LamborghiniView.NO);

        cmbSEDeportivo = new JComboBox();
        cmbSEDeportivo.addItem(LamborghiniView.SI);
        cmbSEDeportivo.addItem(LamborghiniView.NO);

        cmbTelemetriaL = new JComboBox();
        cmbTelemetriaL.addItem(LamborghiniView.SI);
        cmbTelemetriaL.addItem(LamborghiniView.NO);

        txtOrderId = new JTextField(10);

        lblOrderId = new JLabel("Order ID:");

        lblConvertible = new JLabel("Convertible:");
        lblReceptorDAB = new JLabel("Receptor DAB:");
        lblFaros = new JLabel("Faros:");
        lblColor = new JLabel("Color:");
        lblRines = new JLabel("Rines:");

        lblModelo = new JLabel("Modelo:");
        lblSuspensionMR = new JLabel("Suspensión Magnética Reológica:");
        lblSEDeportivo = new JLabel("Sistema de escape deportivo");
        lblTelemetriaL = new JLabel("Telemetria Lamborghini:");

        //Create the open button
        JButton createOrderButton
                = new JButton(LamborghiniView.CREATE_ORDER);
        createOrderButton.setMnemonic(KeyEvent.VK_C);

        JButton regresarButton = new JButton(LamborghiniView.REGRESAR);
        regresarButton.setMnemonic(KeyEvent.VK_R);

        JButton exitButton = new JButton(LamborghiniView.EXIT);
        exitButton.setMnemonic(KeyEvent.VK_X);

        ButtonHandlerL objButtonHandler = new ButtonHandlerL(this);

        regresarButton.addActionListener(objButtonHandler);
        createOrderButton.addActionListener(objButtonHandler);
        exitButton.addActionListener(new ButtonHandler());
        //For layout purposes, put the buttons in a separate panel
        JPanel buttonPanel = new JPanel();

        JPanel panel = new JPanel();

        GridBagLayout gridbag2 = new GridBagLayout();
        panel.setLayout(gridbag2);
        GridBagConstraints gbc2 = new GridBagConstraints();
        panel.add(createOrderButton);
        panel.add(regresarButton);
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
        buttonPanel.add(cmbSuspensionMR);
        buttonPanel.add(cmbSEDeportivo);
        buttonPanel.add(cmbTelemetriaL);

        buttonPanel.add(lblConvertible);
        buttonPanel.add(lblReceptorDAB);
        buttonPanel.add(lblFaros);
        buttonPanel.add(lblColor);
        buttonPanel.add(lblRines);
        buttonPanel.add(lblModelo);
        buttonPanel.add(lblSuspensionMR);
        buttonPanel.add(lblSEDeportivo);
        buttonPanel.add(lblTelemetriaL);

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
        gridbag.setConstraints(lblSuspensionMR, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 7;
        gridbag.setConstraints(cmbSuspensionMR, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 8;
        gridbag.setConstraints(lblSEDeportivo, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 8;
        gridbag.setConstraints(cmbSEDeportivo, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridx = 0;
        gbc.gridy = 9;
        gridbag.setConstraints(lblTelemetriaL, gbc);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 9;
        gridbag.setConstraints(cmbTelemetriaL, gbc);

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
                    LamborghiniView.this);
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

    public String getCmbSuspensionMR() {
        return (String) cmbSuspensionMR.getSelectedItem();
    }

    public String getCmbSEDeportivo() {
        return (String) cmbSEDeportivo.getSelectedItem();
    }

    public String getCmbTelemetriaL() {
        return (String) cmbTelemetriaL.getSelectedItem();
    }    

    public JTextField getTxtOrderId() {
        return txtOrderId;
    }
    
    

} // End of class LamborghiniView

class ButtonHandlerL implements ActionListener {

    LamborghiniView objLamborghiniView;

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals(LamborghiniView.EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(LamborghiniView.CREATE_ORDER)) {

            //Capturar Atributos
            
            boolean suspensionMR = objLamborghiniView.getCmbSuspensionMR().equals("Si");
            boolean sEDeportivo = objLamborghiniView.getCmbSEDeportivo().equals("Si");
            boolean telemetriaL = objLamborghiniView.getCmbTelemetriaL().equals("Si");
            int orderId = Integer.parseInt(objLamborghiniView.getOrderID());
            boolean convertible = objLamborghiniView.getCmbConvertible().equals("Si");
            boolean receptorDAB = objLamborghiniView.getCmbReceptorDAB().equals("Si");
            String faros = objLamborghiniView.getCmbFaros();   
            //String color = objLamborghiniView.
            String rines = objLamborghiniView.getCmbRines();
            String modelo = objLamborghiniView.getCmbModelo();
            
            //Crear objeto de tipo Lambo pasando por parametro los datos
            Lamborghini lambo = new Lamborghini(suspensionMR, sEDeportivo, telemetriaL, orderId, convertible, receptorDAB, faros, modelo, rines, modelo);

            //Enviar al Builder
            LamborghiniOrderBuilder l = LamborghiniOrderBuilder.getLamborghiniOrderBuilder();
            l.agregarVehiculo(lambo);

        }

        if (e.getActionCommand().equals(LamborghiniView.REGRESAR)) {
            objLamborghiniView.setVisible(false);
            objLamborghiniView.objOrderManager.setVisible(true);
        }
    }

    public ButtonHandlerL() {
    }

    public ButtonHandlerL(LamborghiniView inObjLamborghiniView) {
        objLamborghiniView = inObjLamborghiniView;
    }

}
