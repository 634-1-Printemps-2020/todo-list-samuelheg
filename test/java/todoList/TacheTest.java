package todoList;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TacheTest {
    @Test
    public void addTask() throws TacheException {
        User user = new User("Samuel","samuel@gmail.com");
        Tache tache = new Tache(user,"Tache test",new Date());
        Tache tache2 = new Tache(user,"Tache test",new Date());
        TodoList todoList = new TodoList();
        todoList.creerTache(user,tache);
        Assert.assertTrue(todoList.getTachesUser(user).contains(tache2));
    }

    @Test
    public void cancelTask() throws TacheException {

    }


}
