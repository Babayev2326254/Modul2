package Leson111.Service;

import Leson111.Dao.HumanDao;
import Leson111.Human;

public class HumanService {
    private HumanDao humanDao;

    public HumanService(HumanDao humanDao) {
        this.humanDao = humanDao;
    }

    public Human getHumanByIndex(int id){
        return humanDao.getHumanByIndex(id);
    }
    public void addHuman(Human human){
        humanDao.addHuman(human);
    }
}
