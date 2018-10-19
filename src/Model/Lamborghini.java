package Model;

import Logic.Order;
import Logic.OrderVisitor;

public class Lamborghini extends Order {
  
  private boolean suspensionMR;
  private boolean sEDeportivo;
  private boolean telemetriaL;

public Lamborghini(boolean suspensionMR, boolean sEDeportivo, boolean telemetriaL, int orderId, boolean convertible, boolean receptorDAB, String faros, String color, String rines, String modelo) {
    super(orderId, convertible, receptorDAB, faros, color, rines, modelo);
    this.suspensionMR = suspensionMR;
    this.sEDeportivo = sEDeportivo;
    this.telemetriaL = telemetriaL;
}

  

  @Override
  public void accept(OrderVisitor v) {
    v.visit(this);
  }
}
