package MCO2;

import MCO2.Controller.mainMenuController;
import MCO2.View.mainMenuGUI;
import MCO2.Model.inventory;

/**
 * The main class that starts the Pokemon Game.
 * This class is used to drive the mainMenuGUI and inventory, and provide a graphical user menu for users.
 */
public class Driver {

    /**
     * The main entry point for the application.
     * It provides an interactive menu to perform operations on inventory object.
     * It allows users to View Inventory and Navigate through the different areas and exit the program.
     *
     * @param args Array of string arguments passed to the main method.
     */
    public static void main(String[] args) {
        mainMenuGUI menu = new mainMenuGUI();
        inventory inventory = new inventory();

        new mainMenuController(menu, inventory);
    }
}
