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
import com.sun.java.swing.plaf.windows.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author olixe
 */

public class BMWView extends JFrame {
  
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
  
  public static final String I8R = "i8Roadster";
  public static final String M240I = "M240i";
  public static final String X3 = "X3";
  public static final String M40I = "M40i";
  public static final String M2C = "M2 Competition";
          
  public static final String DEFAULT = "Default";
  public static final String HALO = "i Halo";
  public static final String ACCARO = "i Accaro";        
  
 
 public OrderManager objOrderManager;

  //Generales
  private JComboBox cmbConvertible;
  private JComboBox cmbReceptorDAB;
  private JComboBox cmbFaros;
  private JColorChooser clcColor;
  private JComboBox cmbRines;
 
  //Propios
  private JComboBox cmbModelo;
  private JComboBox cmbDiseñoInt;
  private JComboBox cmbNavegacionIS;
  private JComboBox cmbSElevacion;
  
  private JTextField txtOrderId;
  private JLabel lblOrderId;
  
  private JLabel lblConvertible, lblReceptorDAB, lblFaros, lblColor, lblRines;
  private JLabel lblModelo, lblDiseñoInt, lblNavegacionIS, lblSElevacion;

  //private OrderVisitor objVisitor;

  public BMWView(OrderManager inObjOrderManager) {
    super("BMW Order");

    //Create the visitor instance
   // objVisitor = new OrderVisitor();
    objOrderManager = inObjOrderManager;
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
    cmbModelo.addItem(BMWView.I8R);
    cmbModelo.addItem(BMWView.M240I);
    cmbModelo.addItem(BMWView.X3);
    cmbModelo.addItem(BMWView.M40I);
    cmbModelo.addItem(BMWView.M2C);
    
    cmbDiseñoInt = new JComboBox();
    cmbDiseñoInt.addItem(BMWView.DEFAULT);
    cmbDiseñoInt.addItem(BMWView.HALO);
    cmbDiseñoInt.addItem(BMWView.ACCARO);
  
    cmbNavegacionIS = new JComboBox();
    cmbNavegacionIS.addItem(BMWView.SI);
    cmbNavegacionIS.addItem(BMWView.NO);
    
    cmbSElevacion = new JComboBox();
    cmbSElevacion.addItem(BMWView.SI);
    cmbSElevacion.addItem(BMWView.NO);
    
    txtOrderId= new JTextField(10);
    
    lblOrderId = new JLabel("Order ID:");
    
    lblConvertible = new JLabel("Convertible:");
    lblReceptorDAB = new JLabel("Receptor DAB:");
    lblFaros = new JLabel("Faros:");
    lblColor = new JLabel("Color:");
    lblRines = new JLabel("Rines:");
    
    
    lblModelo = new JLabel("Modelo:");
    lblDiseñoInt = new JLabel("Diseño Interior:");
    lblNavegacionIS = new JLabel("Navegación e Interfaz Smartphone");
    lblSElevacion = new JLabel("Sistema de elevación:");
    
    //Create the open button

    JButton createOrderButton =
      new JButton(BMWView.CREATE_ORDER);
    createOrderButton.setMnemonic(KeyEvent.VK_C);
    
    JButton regresarButton = new JButton(BMWView.REGRESAR);
    regresarButton.setMnemonic(KeyEvent.VK_R);
    
    JButton exitButton = new JButton(BMWView.EXIT);
    exitButton.setMnemonic(KeyEvent.VK_X);
    
    ButtonHandlerB objButtonHandler = new ButtonHandlerB(this);


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
  buttonPanel.add(cmbDiseñoInt);
  buttonPanel.add(cmbNavegacionIS);
  buttonPanel.add(cmbSElevacion);
  
  buttonPanel.add(lblConvertible);
  buttonPanel.add(lblReceptorDAB);
  buttonPanel.add(lblFaros);
  buttonPanel.add(lblColor);
  buttonPanel.add(lblRines);
  buttonPanel.add(lblModelo);
  buttonPanel.add(lblDiseñoInt);
  buttonPanel.add(lblNavegacionIS);
  buttonPanel.add(lblSElevacion);
  
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
    gridbag.setConstraints(lblDiseñoInt, gbc);
    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 1;
    gbc.gridy = 7;
    gridbag.setConstraints(cmbDiseñoInt, gbc);
    
    gbc.anchor = GridBagConstraints.EAST;
    gbc.gridx = 0;
    gbc.gridy = 8;
    gridbag.setConstraints(lblNavegacionIS, gbc);
    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 1;
    gbc.gridy = 8;
    gridbag.setConstraints(cmbNavegacionIS, gbc);
    
    gbc.anchor = GridBagConstraints.EAST;
    gbc.gridx = 0;
    gbc.gridy = 9;
    gridbag.setConstraints(lblSElevacion, gbc);
    gbc.anchor = GridBagConstraints.WEST;
    gbc.gridx = 1;
    gbc.gridy = 9;
    gridbag.setConstraints(cmbSElevacion, gbc);

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
        BMWView.this);
    } catch (Exception ex) {
      System.out.println(ex);
    }

  }
  /*public OrderVisitor getOrderVisitor() {
    return objVisitor;
  }
  public String getOrderType() {
    return (String) cmbOrderType.getSelectedItem();
  }*/
  public String getOrderID() {
    return txtOrderId.getText();
  }

} // End of class BMWView

class ButtonHandlerB implements ActionListener {
    
  BMWView objBMWView;
  
  public void actionPerformed(ActionEvent e) {

    if (e.getActionCommand().equals(BMWView.EXIT)) {
      System.exit(1);
    }
    if (e.getActionCommand().equals(BMWView.CREATE_ORDER)) {
        
    }

    if (e.getActionCommand().equals(BMWView.REGRESAR)) {
        
        objBMWView.setVisible(false);
        objBMWView.objOrderManager.setVisible(true);
    }
  }



  public ButtonHandlerB() {
  }
  public ButtonHandlerB(BMWView inObjBMWView) {
    objBMWView = inObjBMWView;
  }

} // End of class ButtonHandler