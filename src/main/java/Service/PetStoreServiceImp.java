package Service;

import Dao.AccountDao;
import Dao.ItemDao;

public class PetStoreServiceImp implements PetStoreService {
    private AccountDao accountDao;
    private ItemDao itemDao;

    public PetStoreServiceImp(AccountDao accountDao, ItemDao itemDao) {
        this.accountDao = accountDao;
        this.itemDao = itemDao;
    }

    public void sell(int num) {
        accountDao.add(num*5);
        itemDao.minus(num);
    }


    public void setAccountDao(AccountDao accountDao) {
    }

    public void setItemDao(ItemDao itemDao) {
    }
}
