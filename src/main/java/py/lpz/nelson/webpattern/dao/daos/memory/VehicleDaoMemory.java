package py.lpz.nelson.webpattern.dao.daos.memory;

import py.lpz.nelson.webpattern.dao.daos.VehicleDao;
import py.lpz.nelson.webpattern.dao.entities.Vehicle;

public class VehicleDaoMemory extends GenericMemoryDao<Vehicle, String> implements VehicleDao {

    @Override
    protected String getId(Vehicle entity) {
        return entity.getId();
    }
}
