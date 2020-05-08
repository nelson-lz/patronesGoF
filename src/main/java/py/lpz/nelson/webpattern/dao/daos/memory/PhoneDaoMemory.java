package py.lpz.nelson.webpattern.dao.daos.memory;

import py.lpz.nelson.webpattern.dao.daos.PhoneDao;
import py.lpz.nelson.webpattern.dao.entities.Phone;

public class PhoneDaoMemory extends GenericMemoryDao<Phone, String> implements PhoneDao {

    @Override
    protected String getId(Phone entity) {
        return entity.getId();
    }
}
