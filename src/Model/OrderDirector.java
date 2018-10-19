/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Logic.IOrderBuilder;
import Logic.Order;

/**
 *
 * @author olixe
 */
public class OrderDirector {

    private IOrderBuilder myBuilder;

    public OrderDirector(IOrderBuilder builder) {
        myBuilder = builder;
    }

    public void agregarVehiculo(int orderId, boolean convertible, boolean receptorDAB, String faros, String rines, String modelo, boolean tapacubos, boolean elevadorSus, boolean camaraFrontal) {
        this.myBuilder.agregarVehiculo();
    }
    /*public void getReport() {
        this.myBuilder.getReport();
    }
*/
}
