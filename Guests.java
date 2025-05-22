public class Guests {
  public static final int Tax=5;
  public String Name;
  public String Contact;
  public String serviceConsumed;
  public int serviceCharge;

  public void displayDetails(){
      System.out.println("Guest name: "+Name+"\nGuest contact: "+Contact+"\nService consumed: "+serviceConsumed+"\nService charge: "+serviceCharge);
  }
}
