package Controller.Subway;

import java.util.ArrayList;

import Interface.ITransport;

public class Subway implements ITransport {
  private double avgSpeed;
  private int cap;
  private String payMet;
  private ArrayList<String> routes;

  public Subway(double avgSpeed, int cap, String payMet, ArrayList<String> routes) {
    this.avgSpeed = avgSpeed;
    this.cap = cap;
    this.payMet = payMet;
    this.routes = routes;
  }

  @Override
  public double getAvgSpeed() {
    return this.avgSpeed;
  }

  public void setAvgSpeed(double avgSpeed) {
    if (avgSpeed <= 0) {
      throw new Error("A velocidade média não pode ser 0 ou menor.");
    } else {
      this.avgSpeed = avgSpeed;
    }
  }

  @Override
  public int getCap() {
    return this.cap;
  }

  public void setCap(int cap) {
    if (cap <= 0) {
      throw new Error("A capacidade não pode ser 0 ou menor.");
    } else {
      this.cap = cap;
    }
  }

  @Override
  public String getPayMet() {
    return this.payMet;
  }

  public void setPayMet(String payMet) {
    if (payMet == "") {
      throw new Error("Método de pagamento não pode ser vazio");
    } else {
      this.payMet = payMet;
    }
  }

  @Override
  public ArrayList<String> getRoutes() {
    return this.routes;
  }

  public void setRoutes(ArrayList<String> routes) {
    if (routes == null) {
      throw new Error("A rota não pode ser vazia");
    } else {
      this.routes = routes;
    }
  }

  @Override
  public String toString() {
    return "Average speed: " + this.avgSpeed + "km/h\nCapacity: " + this.cap + "\nPayment methods: " + this.payMet
        + "\nRoutes: " + this.routes;
  }
}
