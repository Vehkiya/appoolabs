package problema2.dateFixe;

import static problema2.dateFixe.TipPost.ANGAJAT;
import static problema2.dateFixe.TipPost.SEF;

public enum Post {
    PROGRAMATOR(ANGAJAT),
    INGINER(ANGAJAT),
    MANAGER(SEF);

    TipPost tip;

    Post(TipPost tipulPostului) {
        this.tip = tipulPostului;
    }

    public TipPost getTip() {
        return tip;
    }
}
