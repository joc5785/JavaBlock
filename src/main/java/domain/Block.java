package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by o'connell on 9/29/17.
 */
public class Block {

    private long blockIndex;
    private String previousBlockHash;
    private String BlockHash;
    private String timeStamp;
    private String data;
//  private ArrayList<String> txData;


    public Block(long blockIndex, String previousBlockHash, String blockHash, String timeStamp, String data) {
        super();
        this.blockIndex = blockIndex;
        this.previousBlockHash = previousBlockHash;
        BlockHash = blockHash;
        this.timeStamp = timeStamp;
        this.data = data;
//        this.txData = txData;
    }


    public long getBlockIndex() {
        return blockIndex;
    }
    public void setBlockIndex(long blockIndex) {
        this.blockIndex = blockIndex;
    }
    public String getPreviousBlockHash() {
        return previousBlockHash;
    }
    public void setPreviousBlockHash(String previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }
    public String getBlockHash() {
        return BlockHash;
    }
    public void setBlockHash(String blockHash) {
        BlockHash = blockHash;
    }
    public String getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    //public List<String> getTxData() {
//        return txData;
//      }
//    public void setTxData(ArrayList<String> txData) {
//        this.txData = txData;
//    }


}

//On block generation turn date to string and set