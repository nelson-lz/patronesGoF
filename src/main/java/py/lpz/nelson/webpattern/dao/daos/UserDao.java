package py.lpz.nelson.webpattern.dao.daos;

import py.lpz.nelson.webpattern.dao.entities.User;

import java.util.List;

public interface UserDao extends GenericDao<User, String> {

    List<User> findByName(String name);
}
