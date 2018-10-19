package Logic;

public abstract class Order {
    
  protected int orderId;
  protected boolean convertible;
  protected boolean receptorDAB;
  protected String faros;
  protected String color;
  protected String rines;
  protected String modelo;

    public Order(int orderId, boolean convertible, boolean receptorDAB, String faros, String color, String rines, String modelo) {
        this.orderId = orderId;
        this.convertible = convertible;
        this.receptorDAB = receptorDAB;
        this.faros = faros;
        this.color = color;
        this.rines = rines;
        this.modelo = modelo;
    }
  
  
    
  public abstract void accept(OrderVisitor v);


  
  
}
