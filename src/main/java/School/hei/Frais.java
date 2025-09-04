package School.hei;

import lombok.Getter;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;


@Getter
public class Frais {
    private int Id;
    private String label;
    private double montant;
    private Instant Deadline;
    private List<Payment> payment;

    public Frais(int id, String label, double montant, Instant deadline) {
        Id = id;
        this.label = label;
        this.montant = montant;
        Deadline = deadline;
    }

    public double Progress(Instant x, double montant) {
        if (Deadline.isAfter(x) && montant > payment.getFirst().getMontant()) {
            return payment.get(payment.size() - 1).getMontant() - montant;

        }
    }

    public double Payd(Instant x, double montant) {
        if (Deadline.isAfter(x) && montant == payment.getFirst().getMontant()) {
            return payment.get(payment.size() - 1).getMontant() - montant;
        }
    }


}
