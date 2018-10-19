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
public class LamborghiniOrderBuilder implements IOrderBuilder, Iterator {

    private static LamborghiniOrderBuilder lBuilder;    
    private Vector vehiculosL;
    
    private LamborghiniOrderBuilder() {
        vehiculosL = new Vector();
    }
    
    public static LamborghiniOrderBuilder getLamborghiniOrderBuilder(){
        if(lBuilder==null){
            lBuilder = new LamborghiniOrderBuilder();
        }
        return lBuilder;        
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
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarVehiculo(Order oVehiculo) {
        vehiculosL.add(oVehiculo);  
    }
    
    
    
}
