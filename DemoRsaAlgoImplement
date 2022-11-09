package Rsa;
class rsaAlgo {
    private static String message;
    private static char[] charmsg;
    private int p;
    private int q;
    private static int e;
    private static int[] encode;
    private static int[] ncode;

    private static int[] enmsg;
    String encodedMsg;
    public rsaAlgo(String message, int p, int q,int e) {
        charmsg=message.toLowerCase().toCharArray();
        this.p = p;
        this.q = q;
        this.e=e;

    }

    private int coPrimeGcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return coPrimeGcd(a-b, b);

        return coPrimeGcd(a, b-a);
    }
    private int GCD(int a,int b){
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return b;
    }
    public void encryption(){
        int pq=p*q;
        int On=(p-1)*(q-1);
        int gcd=GCD(e,On);
        ncode=new int[charmsg.length];
        for (int i=0;i<charmsg.length;i++) {
            ncode[i]=(int)charmsg[i];//
        }
        for(int i=0;i<charmsg.length;i++)
            System.out.print(i+":"+ncode[i]+" ");
        encode=new int[charmsg.length];
        char[] enmsg=new char[charmsg.length];

        for(int i=0;i<charmsg.length;i++){
            int msgcode=ncode[i];
            double power=Math.pow(msgcode,e);
            System.out.println("power "+i+":"+power);
            double ciphering=power % pq;
            char letter=(char)(ciphering);//
            encode[i]=(int)ciphering;
            enmsg[i]=letter;

        }
          encodedMsg=new String(enmsg);
    }

    public void code(){
        for(int i=0;i<ncode.length;i++){
            System.out.print(ncode[i]+" ");
        }
    }
    public void encryptedCode(){
        for(int i=0;i<charmsg.length;i++)
            System.out.print(encode[i]+" ");
    }
    public void encryptedMessage(){
        System.out.println("encrypted message:"+encodedMsg);
    }
}
