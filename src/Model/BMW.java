package Model;

import Logic.Order;
import Logic.OrderVisitor;

public class BMW extends Order {

    private String diseñoInt;
    private boolean navegacionIS;
    private boolean elevacion;

    public BMW(String diseñoInt, boolean navegacionIS, boolean elevacion, int orderId, boolean convertible, boolean receptorDAB, String faros, String color, String rines, String modelo) {
        super(orderId, convertible, receptorDAB, faros, color, rines, modelo);
        this.diseñoInt = diseñoInt;
        this.navegacionIS = navegacionIS;
        this.elevacion = elevacion;
    }

  
  
  
  
 @Override
  public void accept(OrderVisitor v) {
    v.visit(this);
  }

}

