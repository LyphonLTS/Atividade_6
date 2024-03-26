package Interface;

import java.util.ArrayList;

public interface ITransportFactory {
  public ITransport creatTransport(double avgSpeed, int cap, String payMet, ArrayList<String> routes);
}
