package Interface;

import java.util.ArrayList;

public interface ITransport {
  public int getCap();

  public String getPayMet();

  public double getAvgSpeed();

  public ArrayList<String> getRoutes();

  public String toString();
}
