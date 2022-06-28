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
public class Task {
    private int id;
    private String title;
    private String begin;
    private String end;
    private int totalHours;
    //cai dat quan he 1 task duoc lam boi nhieu staff
    private Staff[] stafflist;
    private int noOfStaff;
    public Task() {
        id=0;
        title="";
        begin="";
        end="";
        totalHours=0;
        stafflist=new Staff[100];
        noOfStaff=0;
    }

    public Task(int id, String title, String begin, String end, int totalHours) {
        this.id = id;
        this.title = title;
        this.begin = begin;
        this.end = end;
        this.totalHours = totalHours;
        this.stafflist=new Staff[100];
        this.noOfStaff=0;
    }
    public void input(){
        
    }
    public void output(){
        
    }
    //ham nay de them 1 staff vao stafflist
    public boolean addStaff(Staff staff){
        if(staff!=null && noOfStaff<100){
            stafflist[noOfStaff]=staff;
            noOfStaff++;           
            return true;
        }
        return false;
    }
    public void displayAllStaffs(){
        if(noOfStaff>0){
            System.out.println("DS NV thuc hien du an:");
            for (Staff staff : stafflist) {
                staff.outputStaff();
            }
        }
        else System.out.println("chua co nv nao thuc hien du an nay");
    }
}
