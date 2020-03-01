package todoList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoList {
    private List<Tache> todoList;
    private int size;

    public TodoList(ArrayList<Tache> todoList) {
        this.todoList = todoList;
        this.size = 0;
    }

    public TodoList() {
        this.todoList = new ArrayList<Tache>();
        this.size = 0;
    }

    public TodoList(Tache tache) {
        this.todoList = new ArrayList<Tache>();
        this.size = 0;
        creerTache(tache);
    }

    public int getSize() {
        return size;
    }

    public Tache creerTache(Tache tache){
        this.todoList.add(tache);
        this.size ++;
        return tache;
    }

    public Tache annulerTache(Tache tache){
        if (this.todoList.contains(tache)) {
            this.todoList.remove(tache);
            this.size--;
            return tache;
        }else{
            return null;
        }
    }

    public List<Tache> getTachesParStatut(String statut){
        List<Tache> taches = new ArrayList<Tache>();
        for (Tache tache:this.todoList) {
           if (statut.equals(tache.getStatut())){
               taches.add(tache);
           }
        }
        return taches;
    }

    public List<Tache> getTachesParDate(Date date){
        List<Tache> taches = new ArrayList<Tache>();
        for (Tache tache:this.todoList) {
            if (date.compareTo(tache.getDate())== 0){
                taches.add(tache);
            }
        }
        return taches;
    }

}
