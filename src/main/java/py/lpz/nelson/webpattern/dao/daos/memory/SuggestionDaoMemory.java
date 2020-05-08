package py.lpz.nelson.webpattern.dao.daos.memory;

import py.lpz.nelson.webpattern.dao.daos.SuggestionDao;
import py.lpz.nelson.webpattern.dao.entities.Suggestion;

public class SuggestionDaoMemory extends GenericMemoryDao<Suggestion, String> implements SuggestionDao {

    @Override
    protected String getId(Suggestion entity) {
        return entity.getId();
    }
}
