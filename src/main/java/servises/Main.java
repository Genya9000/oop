package servises;

import view.Creditline;

public class Main {
    public static void main(String[] args) {
          Controller controller = new Creditline();
          System.out.println("Your conditions are met only in the bank " + controller.getBank());
    }
}
