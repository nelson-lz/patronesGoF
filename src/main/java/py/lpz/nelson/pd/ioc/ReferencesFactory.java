package py.lpz.nelson.pd.ioc;

public interface ReferencesFactory {

    int getReference(String key);

    void removeReference(String key);

}
