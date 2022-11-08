package two;
//
public class Executor {
    public static void main(String[] args) {
//
        byte prviBroj = 35;
        short drugiBroj = -32768;
        int treciBroj = 567443323;
        long cetvrtiBroj = 5436547678l;
        long suma = prviBroj + drugiBroj + treciBroj + cetvrtiBroj;
        System.out.println(suma);
        float prviBrojDecimalni = 23.4f;
        double drugiBrojDecimalni = 23.4;
        System.out.println(prviBrojDecimalni + drugiBroj);
        System.out.println(drugiBrojDecimalni);
        char slovo = 65;
        System.out.println(slovo + prviBroj);
        System.out.println(slovo);
        boolean condition = treciBroj==drugiBrojDecimalni;
        System.out.println(condition);


    }
}
