package School.hei;

import lombok.Getter;

import java.time.Instant;

@Getter
public class PaymentParBanque extends Payment {
    private int Anne;


    public PaymentParBanque(int id, Instant dateEtHeure, double montant) {
        super(id, dateEtHeure, montant);
    }
}
