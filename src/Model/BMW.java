package Model;

import Logic.Order;
import Logic.OrderVisitor;

public class BMW extends Order {

    private String diseñoInt;
    private boolean navegacionIS;
    private boolean elevacion;

  public BMW() {
  }
  public BMW(int id, boolean c, boolean r, String f, String cl, String rn, String m, String d, boolean n, boolean e) {
    orderId = id;
    convertible = c;
    receptorDAB = r;
    faros = f;
    color = cl;
    rines = rn;
    modelo = m; 
    diseñoInt = d;
    navegacionIS = n;
    elevacion= e;
  }
  
 @Override
  public void accept(OrderVisitor v) {
    v.visit(this);
  }

}

