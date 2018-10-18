package Model;

import Logic.OrderVisitor;
import Logic.Order;

public class Ferrari extends Order {
  
  private boolean tapacubos;
  private boolean elevadorSus;
  private boolean camaraFrontal;

  

  public Ferrari() {
      
  }
  public Ferrari(int id, boolean c, boolean r, String f, String cl, String rn, String m, boolean t, boolean e, boolean cmr) {
    orderId = id;
    convertible = c;
    receptorDAB = r;
    faros = f;
    color = cl;
    rines = rn;
    modelo = m; 
    tapacubos = t;
    elevadorSus = e;
    camaraFrontal= cmr;
  }
  
  @Override
  public void accept(OrderVisitor v) {
    v.visit(this);
  }
}
