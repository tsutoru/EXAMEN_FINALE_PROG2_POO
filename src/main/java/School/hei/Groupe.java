package School.hei;

import lombok.Getter;

@Getter
public class Groupe {
    private int IdGroupe;
    private String Nom;

    public Groupe(int idGroupe, String nom) {
        IdGroupe = idGroupe;
        Nom = nom;
    }
}
