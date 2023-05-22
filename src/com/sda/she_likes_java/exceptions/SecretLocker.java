package com.sda.she_likes_java.exceptions;

public class SecretLocker {
    private Secret mySecret;

    public SecretLocker(Secret mySecret) {
        this.mySecret = mySecret;
    }

    public Secret tellMeYourSecret() {
        System.out.println("I am sharing with you this...");
        return mySecret;
    }
    //HSM - hardware security module


    //decrypt the data / encrypt the data
    public Secret decryptMessageWithHSM() throws Exception {
        // connect to HSM
        boolean canConnectToHSM = false;
        if (canConnectToHSM) {
            return mySecret;
        }
        throw new Exception("Couldn't connect to HSM");
        //send encrypted Secret to HSM
        // get decrypted value from HSM
        // celebrate the secret ;)

    }

    //using my own exception to class MyBrokenException
    public Secret decryptSecretAndSignalIssueWithMyBrokenException() {

        return null;
    }

    public Secret decrypt() throws HSMConnectionException, DecryptionIssueException {
        boolean canConnectToHSM = false;
        Boolean decryptIssue = false;
        if (canConnectToHSM) {
            System.out.println("I am able to connect to HSM");
            if (decryptIssue) {
                throw new DecryptionIssueException("Broken text");
            }
            return mySecret;
        }
        throw new HSMConnectionException("Couldn't connect to HSM");
        //send encrypted Secret to HSM
        // get decrypted value from HSM
        // celebrate the secret ;)

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
