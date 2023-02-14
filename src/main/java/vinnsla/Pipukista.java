package vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;


public class Pipukista {
    private final ObservableList<Pipa> kista = FXCollections.observableArrayList();
    Random random = new Random();

    public Pipukista() {
        for (int i = 0; i < 4; i++) {
            kista.add(nyPipa());
        }
    }


    private Pipa nyPipa() {
        int RandomInn = random.nextInt(1);
        int RandomUt = random.nextInt(3);
        return new Pipa(RandomInn, RandomUt);
    }

    public Pipa naestaPipa() {
        Pipa pipa = kista.get(0);
        kista.remove(0);
        kista.add(nyPipa());
        return pipa;
    }
}
