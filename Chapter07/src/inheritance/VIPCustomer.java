package inheritance;

public class VIPCustomer extends Customer{

  double salesRatio;
  private int agentID;

  public VIPCustomer() {
    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.01;
  }

  public int getAgentID() {
    return agentID;
  }

  public void setAgentID(int agentID) {
    this.agentID = agentID;
  }
}
