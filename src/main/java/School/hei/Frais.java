package School.hei;

import lombok.Getter;


import java.time.LocalDateTime;

@Getter
public class Frais {
    private int Id;
    private String label;
    private double montant;
    private LocalDateTime Deadline;

    public Frais(int id, String label, double montant, LocalDateTime deadline) {
        Id = id;
        this.label = label;
        this.montant = montant;
        Deadline = deadline;
    }
}
