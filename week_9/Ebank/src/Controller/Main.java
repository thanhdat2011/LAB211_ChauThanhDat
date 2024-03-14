package Controller;

import Model.Ebank;
import View.EbankView;

public class Main {

    public static void main(String[] args) {
        Ebank model = new Ebank();
        EbankView view = new EbankView(model);  // Pass the Ebank model instance to the constructor

        EbankController controller = new EbankController(model, view);
        controller.runEbankSystem();
    }
}
