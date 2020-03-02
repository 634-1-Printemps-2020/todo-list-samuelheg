package todoList;

import java.util.Date;
import java.util.Objects;

public class Tache {
    private User utilisateur;
    private String description;
    private Date date;
    private Statut statut;
    private Resolution resolution;

    public Tache(User utilisateur, String description, Date date) {
        this.utilisateur = utilisateur;
        this.description = description;
        this.date = date;
        this.statut = Statut.OPEN;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tache tache = (Tache) o;
        return Objects.equals(utilisateur, tache.utilisateur) &&
                Objects.equals(description, tache.description) &&
                Objects.equals(date, tache.date) &&
                statut == tache.statut &&
                resolution == tache.resolution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilisateur, description, date, statut, resolution);
    }

}
