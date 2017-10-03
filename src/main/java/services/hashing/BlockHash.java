package services.hashing;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by o'connell on 9/29/17.
 */
public class BlockHash {

    public String getblockHash(Long index, String previousBlockHash, String timeStamp, String data){

        String hashString = Long.valueOf(index)+previousBlockHash+timeStamp+data;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(hashString.getBytes("UTF-8"));
            return DatatypeConverter.printHexBinary(hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


}
