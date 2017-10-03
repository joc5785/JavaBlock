package services.jpa;

import java.util.List;

/**
 * Created by o'connell on 10/2/17.
 */
public interface CreateReadService<T> {

    List<T> listAll();
    T getByIndex(long Id);
    Object saveNew(T object);

}
