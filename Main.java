import java.util.ArrayList;

import Controller.Bus.BusFactory;
import Controller.Subway.SubwayFactory;
import Interface.ITransport;

class Main {
  public static void main(String[] args) {
    BusFactory busFactory = new BusFactory();
    SubwayFactory subwayFactory = new SubwayFactory();

    ArrayList<String> routes = new ArrayList<>();
    routes.add("Point A");
    routes.add("Point B");
    routes.add("Point C");

    ITransport bus = ((BusFactory) busFactory).creatTransport(60.0, 54, "Credit Card", routes);
    ITransport subway = ((SubwayFactory) subwayFactory).creatTransport(120.0, 200, "Ticket", routes);

    System.out.println(bus.toString());
    System.out.println("");
    System.out.println(subway.toString());
  }
}