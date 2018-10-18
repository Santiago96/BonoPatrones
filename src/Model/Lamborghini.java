package Model;

import Logic.Order;
import Logic.OrderVisitor;

public class Lamborghini extends Order {
  
  private boolean suspensionMR;
  private boolean sEDeportivo;
  private boolean telemetriaL;

  public Lamborghini() {
  }
  public Lamborghini(int id, boolean c, boolean r, String f, String cl, String rn, String m, boolean s, boolean sed, boolean tl){
    orderId = id;
    convertible = c;
    receptorDAB = r;
    faros = f;
    color = cl;
    rines = rn;
    modelo = m; 
    suspensionMR = s;
    sEDeportivo = sed;
    telemetriaL = tl;
  }

  @Override
  public void accept(OrderVisitor v) {
    v.visit(this);
  }
}
