package Model;

import Logic.OrderVisitor;
import Logic.Order;

public class Ferrari implements Order {
  private double orderAmount;

  public Ferrari() {
  }
  public Ferrari(double inp_orderAmount) {
    orderAmount = inp_orderAmount;
  }
  public double getOrderAmount() {
    return orderAmount;
  }
  public void accept(OrderVisitor v) {
    v.visit(this);
  }
}
