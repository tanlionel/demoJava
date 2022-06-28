/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author user
 */
public class TaskList {
    private Task[] tasklist;
    private int count;

    public TaskList() {
        tasklist=new Task[100];
        count=0;
    }
    public boolean addTask(Task t){
        return true;
    }
    public Task findTask(int id){
        return null;
    }
    public void displayAll(){
        
    }
    
}
