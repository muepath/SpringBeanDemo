package Service;

import Dao.AccountDao;
import Dao.ItemDao;

public class PetStoreServiceImp implements PetStoreService {
    private AccountDao accountDao;
    private ItemDao itemDao;

    public void sell(int num) {
        accountDao.add(num*5);
        itemDao.minus(num);
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao=accountDao;
    }
}
