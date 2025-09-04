package School.hei;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Etudiant {
    private int Id;
    private String nom;
    private String prenom;
    private LocalDate DateEntrerDansHEI;
    private List<Groupe> groupes;

    public Etudiant(int id, LocalDate dateEntrerDansHEI, String prenom, String nom, List<Groupe> groupes) {
        Id = id;
        DateEntrerDansHEI = dateEntrerDansHEI;
        this.prenom = prenom;
        this.nom = nom;
        this.groupes = groupes;
    }
}
