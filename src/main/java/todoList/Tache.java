package todoList;

import java.util.Date;
import java.util.Objects;

public class Tache {
    private String createur;
    private String description;
    private Date date;
    private String statut;
    private String resolution;

    public Tache(String createur, String description, Date date, String statut, String resolution) throws TacheException {
        checkDate(date);
        checkStatut(statut);
        checkResolution(resolution);
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.statut = statut;
        this.resolution = resolution;
    }

    public String getCreateur() {
        return createur;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public String getStatut() {
        return statut;
    }

    public String getResolution() {
        return resolution;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) throws TacheException {
        checkDate(date);
        this.date = date;
    }

    public void setStatut(String statut) throws TacheException {
        checkStatut(statut);
        this.statut = statut;
    }

    public void setResolution(String resolution) throws TacheException {
        checkResolution(resolution);
        this.resolution = resolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tache tache = (Tache) o;
        return Objects.equals(createur, tache.createur) &&
                Objects.equals(description, tache.description) &&
                Objects.equals(date, tache.date) &&
                Objects.equals(statut, tache.statut) &&
                Objects.equals(resolution, tache.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createur, description, date, statut, resolution);
    }

    private void checkDate(Date date) throws TacheException {
        Date today = new Date();
        if (today.compareTo(date)>0){
            throw new TacheException("La date de la tâche ne peut pas être postérieure à la datea actuelle.");
        }
    }

    private void checkStatut(String statut) throws TacheException {
        if (!statut.equals("open") && !statut.equals("closed")&& !statut.equals("canceled")){
            throw new TacheException("Le statut doit être 'open', 'closed', ou 'canceled'.");
        }
    }

    private void checkResolution(String resolution) throws TacheException {
        if (!resolution.equals("done") && !resolution.equals("ignored")){
            throw new TacheException("La resolution doit être done ou ignored.");
        }
    }
}
