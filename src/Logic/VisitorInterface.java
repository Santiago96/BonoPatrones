package Logic;


import Model.Lamborghini;
import Model.Ferrari;
import Model.BMW;

public interface VisitorInterface {
  public void visit(Ferrari objFerrari);
  public void visit(BMW objBMW);
  public void visit(Lamborghini objLam);
}
