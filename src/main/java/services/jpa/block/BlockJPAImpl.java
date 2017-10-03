package services.jpa.block;

import domain.Block;
import services.jpa.JpaDao;

import javax.persistence.EntityManager;
import java.util.List;

/**
Eventually DB entries could just be a hint to where to find block on disk
 */
public class BlockJPAImpl extends JpaDao implements BlockJPAService {

    @Override
    public List<Block> listAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Block", Block.class).getResultList();
    }

    @Override
    public Block getByIndex(long index) {
        EntityManager em = emf.createEntityManager();
        return em.find(Block.class, index);
    }

    @Override
    //covariant return type will allow for object of block type to be returned
    public Object saveNew(Block object) {
        EntityManager em = emf.createEntityManager();
        Object saveBlock = em.merge(object);
        em.getTransaction().commit();
        return saveBlock;
    }
}
