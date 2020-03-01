package todoList;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TacheTest {
    @Test
    public void checkDate() throws TacheException {
        Date aujourdhui = new Date();
        Tache tache = new Tache("Samuel","test",new Date(aujourdhui.getTime() + (1000 * 60 * 60 * 24)),"open","done");
        TodoList todoList = new TodoList(tache);
        Assert.assertEquals(1,todoList.getSize());
    }

    @Test
    public void checkStatut() throws TacheException {
        Tache tache = new Tache("Samuel","test",new Date(),"open","done");
        TodoList todoList = new TodoList(tache);
        Assert.assertEquals(1,todoList.getSize());
    }

    @Test
    public void checkResolution() throws TacheException {
        Tache tache = new Tache("Samuel","test",new Date(),"open","done");
        TodoList todoList = new TodoList(tache);
        Assert.assertEquals(1,todoList.getSize());
    }

    @Test
    public void setDate() throws TacheException {
        Tache tache = new Tache("Samuel","test",new Date(),"open","done");
        Date today = new Date();
        tache.setDate(new Date(today.getTime() + (1000 * 60 * 60 * 24)));
        Assert.assertEquals(new Date(today.getTime() + (1000 * 60 * 60 * 24)),tache.getDate());
    }

    @Test
    public void setStatut() throws TacheException {
        Tache tache = new Tache("Samuel","test",new Date(),"open","done");
        tache.setStatut("canceled");
        Assert.assertEquals("canceled",tache.getStatut());
    }

    @Test
    public void setResolution() throws TacheException {
        Tache tache = new Tache("Samuel","test",new Date(),"open","done");
        tache.setResolution("ignored");
        Assert.assertEquals("ignored",tache.getResolution());
    }
}
