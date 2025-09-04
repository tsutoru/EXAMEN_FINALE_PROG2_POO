package School.hei;

import lombok.Getter;

import java.time.Instant;

@Getter
public class PaymentParMobilMoney extends Payment {
    private String months;

    public PaymentParMobilMoney(int id, Instant dateEtHeure, double montant) {
        super(id, dateEtHeure, montant);
    }
}
