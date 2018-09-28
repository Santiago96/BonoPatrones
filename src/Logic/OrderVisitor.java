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
    orderTotal = orderTotal + inp_order.getOrderAmount();
  }
  public void visit(BMW inp_order) {
    orderTotal = orderTotal + inp_order.getOrderAmount() +
                 inp_order.getAdditionalTax();
  }
  public void visit(Lamborghini inp_order) {
    orderTotal = orderTotal + inp_order.getOrderAmount() +
                 inp_order.getAdditionalSH();
  }
  public double getOrderTotal() {
    return orderTotal;
  }
}
