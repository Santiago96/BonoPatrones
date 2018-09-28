package Model;

import Logic.OrderVisitor;
import Logic.Order;

public class BMW implements Order {
  private double orderAmount;
  private double additionalTax;

  public BMW() {
  }
  public BMW(double inp_orderAmount,
      double inp_additionalTax) {
    orderAmount = inp_orderAmount;
    additionalTax = inp_additionalTax;
  }
  public double getOrderAmount() {
    return orderAmount;
  }
  public double getAdditionalTax() {
    return additionalTax;
  }
  public void accept(OrderVisitor v) {
    v.visit(this);
  }
}

