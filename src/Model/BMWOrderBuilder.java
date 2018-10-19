/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Logic.IOrderBuilder;
import Logic.Order;
import java.util.Iterator;

/**
 *
 * @author olixe
 */
public class BMWOrderBuilder implements IOrderBuilder,Iterator{
    
    

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarVehiculo(Order oVehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
