package Controller.Subway;

import java.util.ArrayList;

import Interface.ITransport;
import Interface.ITransportFactory;

public class SubwayFactory implements ITransportFactory {
  public ITransport creatTransport(double avgSpeed, int cap, String payMet, ArrayList<String> routes) {
    return new Subway(avgSpeed, cap, payMet, routes);
  }
}
