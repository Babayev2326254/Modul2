package Leson111.Controller;

import Leson111.Human;
import Leson111.Service.HumanService;

public class HumanController {
    private HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    public Human findHumanByIndex(int id){
        return humanService.getHumanByIndex(id);
    }
    public void addAdam(Human adam){
        humanService.addHuman(adam);
    }
}
