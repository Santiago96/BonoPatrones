package Model;

import Logic.OrderVisitor;
import Logic.Order;

public class Ferrari extends Order {

    private boolean tapacubos;
    private boolean elevadorSus;
    private boolean camaraFrontal;

    public Ferrari(boolean tapacubos, boolean elevadorSus, boolean camaraFrontal, int orderId, boolean convertible, boolean receptorDAB, String faros, String color, String rines, String modelo) {
        super(orderId, convertible, receptorDAB, faros, color, rines, modelo);
        this.tapacubos = tapacubos;
        this.elevadorSus = elevadorSus;
        this.camaraFrontal = camaraFrontal;
    }

    @Override
    public void accept(OrderVisitor v) {
        v.visit(this);
    }
}
