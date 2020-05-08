package py.lpz.nelson.webpattern.dao.daos.memory;

import py.lpz.nelson.webpattern.dao.daos.GroupDao;
import py.lpz.nelson.webpattern.dao.entities.Group;

public class GroupDaoMemory extends GenericMemoryDao<Group, String> implements GroupDao {

    @Override
    protected String getId(Group entity) {
        return entity.getId();
    }
}
