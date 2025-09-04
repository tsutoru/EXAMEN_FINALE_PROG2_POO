package School.hei;

import lombok.Getter;

import java.time.Instant;

@Getter
public class Payment {
    private int Id;
    private double montant;
    private Instant dateEtHeure;

    public Payment(int id, Instant dateEtHeure, double montant) {
        Id = id;
        this.dateEtHeure = dateEtHeure;
        this.montant = montant;
    }
}
