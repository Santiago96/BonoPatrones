package Logic;

import Model.Lamborghini;
import Model.Ferrari;
import Model.BMW;
import java.util.*;

public class OrderVisitor implements VisitorInterface {
  private Vector orderObjList;
  private double orderTotal;

  public OrderVisitor() {
    orderObjList = new Vector();
  }
  public void visit(Ferrari inp_order) {
    orderTotal = orderTotal;
  }
  public void visit(BMW inp_order) {
    orderTotal = orderTotal;
  }
  public void visit(Lamborghini inp_order) {
    orderTotal = orderTotal;
  }
  public double getOrderTotal() {
    return orderTotal;
  }
}
