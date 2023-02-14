package vinnsla;

public class Pipa {

    private String h1;
    private String h2;

    private static int[] endi1 = {0, 2, 2, 2};
    private static int[] endi2 = {2, 3, 0, 1};

    public enum Att {
        N, W, S, A, V
    }

    private Att inn;
    private Att ut;

    public Pipa(int t, int r) {
        this.inn = Att.values()[t];
        this.ut = Att.values()[r];
    }

    public Pipa(String h1, String h2) {
        this.h1 = h1;
        this.h2 = h2;
    }


    public boolean flaedir(Pipa s) {
        //
        //
        return true;
    }

}


