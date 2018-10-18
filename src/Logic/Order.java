package Logic;

public abstract class Order {
    
  protected int orderId;
  protected boolean convertible;
  protected boolean receptorDAB;
  protected String faros;
  protected String color;
  protected String rines;
  protected String modelo;
    
  public abstract void accept(OrderVisitor v);


  
  
}
