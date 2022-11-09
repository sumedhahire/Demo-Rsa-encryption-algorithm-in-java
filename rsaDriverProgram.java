package Rsa;
import java.util.*;
public class rsaTrying {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("####################RSA ALGORITHM####################");
        System.out.print("message:");
        String msg=sc.next();
        System.out.print("p:");
        int p=sc.nextInt();
        System.out.print("q:");
        int q= sc.nextInt();
        System.out.print("e:");
        int e= sc.nextInt();

        rsaAlgo rsa=new rsaAlgo(msg,p,q,e);
        rsa.encryption();
        System.out.print("Message code:");
        rsa.code();
        System.out.println();
        System.out.print("encrypted code:");
        rsa.encryptedCode();
        System.out.println();
        rsa.encryptedMessage();
    }
}
