package Logic;


import Model.Lamborghini;
import Model.Ferrari;
import Model.BMW;

public interface VisitorInterface {
  public void visit(Ferrari nco);
  public void visit(BMW co);
  public void visit(Lamborghini oo);
}
