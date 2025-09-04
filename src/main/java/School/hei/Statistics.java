package School.hei;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

public class Statistics {

    public List<Fee> getLateFees(List<Fee> fees, Instant t) {
        return fees.stream()
                .filter(fee -> fee.getStatus(t) == Fee.FeeStatus.LATE)
                .collect(Collectors.toList());
    }

    public double getTotalMissingFees(List<Fee> fees, Instant t) {
        return fees.stream()
                .filter(fee -> fee.getStatus(t) == Fee.FeeStatus.LATE)
                .mapToDouble(fee -> fee.getAmount() - fee.getTotalPayments(t))
                .sum();
    }

    public double getTotalPaidByStudent(Student student, List<Fee> fees, Instant t) {
        return fees.stream()
                .filter(fee -> fee.getStudent().equals(student))
                .mapToDouble(fee -> fee.getTotalPayments(t))
                .sum();
    }
}
