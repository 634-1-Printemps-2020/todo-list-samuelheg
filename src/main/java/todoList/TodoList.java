package todoList;

import java.util.*;

public class TodoList {
    private Map<User,List<Tache>> todoMap = new HashMap<>();

    public TodoList() {
    }

    public Tache creerTache(User user, Tache tache){
        if (!todoMap.containsKey(user)){
            List<Tache> taches = new ArrayList<Tache>();
            todoMap.put(user,taches);
        }
        todoMap.get(user).add(tache);
        return tache;
    }

    public Tache annulerTache(){
        return null;
    }

    public List<Tache> getTachesUser(User user){
        return todoMap.get(user);
    }

}
