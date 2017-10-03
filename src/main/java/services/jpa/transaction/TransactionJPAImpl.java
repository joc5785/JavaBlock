package services.jpa.transaction;

import domain.Transaction;
import services.jpa.JpaDao;

import java.util.List;

/**
 * Created by o'connell on 10/2/17.
 */
public class TransactionJPAImpl extends JpaDao implements TransactionJPAService {

    @Override
    public List<Transaction> listAll() {
        return null;
    }

    @Override
    public Transaction getByIndex(long Id) {
        return null;
    }

    @Override
    public Object saveNew(Transaction object) {
        return null;
    }
}
