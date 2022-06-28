/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import mylib.Validation;

/**
 *
 * @author user
 */
//protected/public
public class Staff {
    private int id;
    private String name;
    private String gender;
    private int basicSalary;
    //cai dat quan he 1 staff lam nhieu task
    private Task[] todolist;
    private int noOfTasks;
    
    public Staff() {
        id=0;
        name="";
        gender="";
        basicSalary=0;
        todolist=new Task[100];
        noOfTasks=0;
    }

    public Staff(int id, String name, String gender, int basicSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
        todolist=new Task[100];
        noOfTasks=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void inputStaff(){
        try {
            id=(int)Validation.inputNumber("input id:", 1, 100);
            name=Validation.inputString("input name:","^[a-zA-Z ]+$");
            gender=Validation.inputString("input gender(F/M):", "^[FM]$");
            basicSalary=(int)Validation.inputNumber("input basic salary:", 1, 1000);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    public void outputStaff(){
        System.out.print(id+"-"+name+"-"+gender+"-"+basicSalary);
    }
    
    //ham nay de them 1 task vao todo list
    public boolean addTask(Task t){
        if(t!=null && noOfTasks<100){
            todolist[noOfTasks]=t;
            noOfTasks++;
            t.addStaff(this);//quan trong 
            return true;
        }
        return false;
    }
    //ham nay de xuat to do list ra man hinh
    public void displayToDoList(){
        if(noOfTasks>0){
           
            System.out.println("DS cong viec phai lam:");
            for (Task task : todolist) {
                task.output();
            
            }
        }
        else System.out.println("chua co task nao dc assign");
    }
}
