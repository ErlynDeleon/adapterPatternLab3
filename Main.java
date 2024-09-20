public class Main {
  public static void main(String[] args) {
      Laptop laptop = new Laptop();
      PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

      Refrigerator refrigerator = new Refrigerator();
      PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);

      SmartphoneCharger phoneCharger = new SmartphoneCharger();
      PowerOutlet phoneOutlet = new SmartphoneAdapter(phoneCharger);

      System.out.println(laptopOutlet.plugIn());
      System.out.println(refrigeratorOutlet.plugIn());
      System.out.println(phoneOutlet.plugIn());
      System.out.println();
  }
}
