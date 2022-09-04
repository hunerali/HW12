import Abstracts.Application;
import Abstracts.Family;
import Abstracts.Humans.Man;
import Abstracts.Humans.Women;
import Abstracts.Pet;
import Abstracts.Pets.Dog;
import Abstracts.view.ConsoleView;
import Dao.FamilyService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ConsoleView app = new ConsoleView();
        while (app.run()) {
            if (!app.run()) break;
        }
    }
}
