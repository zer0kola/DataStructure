package SHA;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        SHA256 sha256 = new SHA256();
        String password = "homework";
        System.out.println(sha256.encrypt(password));
        System.out.println(sha256.encrypt(password+"1"));
        System.out.println(sha256.encrypt(password+"2"));
        System.out.println(sha256.encrypt(password+"3"));
        System.out.println(sha256.encrypt(password+"4"));
        System.out.println(sha256.encrypt(password+"5"));
        System.out.println(sha256.encrypt(password+"6"));
        System.out.println(sha256.encrypt(password+"7"));
        System.out.println(sha256.encrypt(password+"8"));
        System.out.println(sha256.encrypt(password+"9"));
        System.out.println(sha256.encrypt(password+"10"));
        System.out.println(sha256.encrypt(password+"11"));
        System.out.println(sha256.encrypt(password+"12"));
        System.out.println(sha256.encrypt(password+"13"));
        System.out.println(sha256.encrypt(password+"14"));
        System.out.println(sha256.encrypt(password+"15"));
        System.out.println(sha256.encrypt(password+"16"));
        System.out.println(sha256.encrypt(password+"17"));
        System.out.println(sha256.encrypt(password+"18"));
        System.out.println(sha256.encrypt(password+"19"));
        System.out.println(sha256.encrypt(password+"20"));

        System.out.println(sha256.encrypt(sha256.encrypt(password+"1")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"2")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"3")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"4")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"5")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"6")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"7")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"8")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"9")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"10")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"11")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"12")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"13")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"14")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"15")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"16")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"17")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"18")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"19")));
        System.out.println(sha256.encrypt(sha256.encrypt(password+"20")));
    }
}
