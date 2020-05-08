package py.lpz.nelson.webpattern.dao.daos.memory;

import py.lpz.nelson.webpattern.dao.daos.UserDao;
import py.lpz.nelson.webpattern.dao.entities.User;

import java.util.Collections;
import java.util.List;

public class UserDaoMemory extends GenericMemoryDao<User, String> implements UserDao {

    @Override
    protected String getId(User entity) {
        return entity.getId();
    }

    @Override
    public List<User> findByName(String name) {
        return Collections.emptyList();
    }
}
