//
// Colectie.java - Exemplu de container ArrayList
//

import java.util.*;

class Mar {
    private int nr;

    Mar(int i) {
        nr = i;
    }

    void print() {
        System.out.println("Mar #" + nr);
    }
}

class Para {
    private int nr;

    Para(int i) {
        nr = i;
    }

    void print() {
        System.out.println("Para #" + nr);
    }
}

public class Colectie {

    public static void main(String[] args) {
        ArrayList mere = new ArrayList();

        Iterator<Mar> marIterator = mere.iterator();

        // implementarea cu iteratori
        int i=0;
        while (marIterator.hasNext()){
            mere.add(new Mar(i));
            i++;
        }

//        exemplul vechi din conditie

//        for (int i = 0; i < 7; i++)
//            mere.add(new Mar(i));
//        // Se adauga pere la mere
//        mere.add(new Para(7));
//        for (int i = 0; i < mere.size(); i++)
//            ((Mar) mere.get(i)).print();
//        // Eroarea este detectata in timpul executiei
    }
}
