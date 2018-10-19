/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Logic.IOrderBuilder;
import Logic.Order;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author olixe
 */
public class FerrariOrderBuilder implements IOrderBuilder, Iterator {

    private static FerrariOrderBuilder fBuilder;
    private Vector vehiculosF;

    private FerrariOrderBuilder() {
        vehiculosF = new Vector();
    }

    public static FerrariOrderBuilder getFerrariOrderBuilder() {
        if (fBuilder == null) {
            fBuilder = new FerrariOrderBuilder();
        }
        return fBuilder;
    }


    public void agregarVehiculo() {
        
        
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarVehiculo(Order oVehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
