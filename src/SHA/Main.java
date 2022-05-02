package SHA;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        SHA256 sha256 = new SHA256();
        String password = "homework" +
                "";
        String cryptogram = sha256.encrypt(password);
        System.out.println(cryptogram);
        System.out.println(cryptogram.equals(sha256.encrypt(password)));
    }

}
