package Controller.Bus;

import java.util.ArrayList;

import Interface.ITransport;
import Interface.ITransportFactory;

public class BusFactory implements ITransportFactory {
  public ITransport creatTransport(double avgSpeed, int cap, String payMet, ArrayList<String> routes) {
    return new Bus(avgSpeed, cap, payMet, routes);
  }
}
