package Leson111;

import Leson111.Controller.HumanController;
import Leson111.Dao.HumanDao;
import Leson111.Service.HumanService;

public class HumanApp {
    public static void main(String[] args) {
        Human human = new Human(1,"FAXI",23);
        HumanController humanController= new HumanController(new HumanService(new HumanDao()));
        humanController.addAdam(human);
        System.out.println(humanController.findHumanByIndex(0));
    }
}
