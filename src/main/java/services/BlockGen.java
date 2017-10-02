package services;

import domain.Block;

/**
 * Created by o'connell on 9/29/17.
 */
public class BlockGen {

    private String lashBlockHash;
    private long blockIndex;
    private Block newBlock;

    public BlockGen(String lashBlockHash, long blockIndex) {
        newBlock = new Block();
        this.lashBlockHash = lashBlockHash;
        this.blockIndex = blockIndex;
    }
}
