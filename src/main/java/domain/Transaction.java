package domain;

/**
 * Created by o'connell on 9/29/17.
 */
public class Transaction {

    private String txid;
    private String dataIn;
    private String dataOut;

    public Transaction(String txid, String dataIn, String dataOut) {
        this.txid = txid;
        this.dataIn = dataIn;
        this.dataOut = dataOut;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getDataIn() {
        return dataIn;
    }

    public void setDataIn(String dataIn) {
        this.dataIn = dataIn;
    }

    public String getDataOut() {
        return dataOut;
    }

    public void setDataOut(String dataOut) {
        this.dataOut = dataOut;
    }
}
