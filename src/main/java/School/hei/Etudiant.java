package School.hei;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School.hei.Student student = (School.hei.Student) o;
        return Objects.equals(Id, student.getId());
        }

        @Override
        public int hashCode() {
            return Objects.hash(Id);
        }
    }
}
