package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by o'connell on 9/29/17.
 */

@Entity
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long blockIndex;

    private String previousBlockHash;
    private String BlockHash;
    private String timeStamp;
    private String data;
//  private ArrayList<String> txData;

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


}

//On block generation turn date to string and set