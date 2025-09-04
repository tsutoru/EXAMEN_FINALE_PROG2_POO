package School.hei;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Fee {
    public enum FeeStatus {
        IN_PROGRESS, PAID, LATE, OVERPAID
    }

    private Etudiant student;
    private double amount;
    private Instant deadline;
    private List<Payment> payments;

    public Fee(Etudiant student, double amount, Instant deadline, List<Payment> payments) {
        this.student = student;
        this.amount = amount;
        this.deadline = deadline;
        this.payments = payments != null ? payments : new ArrayList<>();
    }

    public Etudiant getStudent() {
        return student;
    }

    public double getAmount() {
        return amount;
    }

    public Instant getDeadline() {
        return deadline;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public double getTotalPayments(Instant t) {
        return payments.stream()
                .filter(p -> !p.getDateEtHeure().isAfter(t))
                .mapToDouble(Payment::getMontant)
                .sum();
    }

    public FeeStatus getStatus(Instant t) {
        double totalPaid = getTotalPayments(t);
        if (totalPaid == 0) {
            return null;
        }
        if (totalPaid > amount) {
            return FeeStatus.OVERPAID;
        } else if (totalPaid == amount) {
            return FeeStatus.PAID;
        } else {
            if (t.isAfter(deadline)) {
                return FeeStatus.LATE;
            } else {
                return FeeStatus.IN_PROGRESS;
            }
        }
    }
}






