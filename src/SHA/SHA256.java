package SHA;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {

    public String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());

        return bytesToHex(md.digest());
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }
    public static int CustomHash(String str) {

        long hash = 5381;

        for(int i = 0; i < str.length(); i++)

            hash = ((hash << 5) + hash) + str.charAt(i);

        return (int)(hash & 0x7FFFFFFF);

    }
}