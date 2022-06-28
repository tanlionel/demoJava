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
public class Manager extends Staff {
    private int bonus;
    //them cai nay de cai dat quan 1-n giua manager-staff
    private Staff[] stafflist;
    private int noOfStaffs;
    private final int MAX=100;
    public Manager(){
        super();// goi default constrcutor cua lop cha Staff
        bonus=0;
        stafflist=new Staff[MAX];
        noOfStaffs=0;
    }
    public Manager(int id,String name,String gender, int basicSalary,int bonus){
        super(id, name, gender, basicSalary);//goi constructor co params cua lop cha Staff
        this.bonus=bonus;
        stafflist=new Staff[MAX];
        noOfStaffs=0;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void inputStaff() {
        super.inputStaff(); 
         try {
            bonus=(int)Validation.inputNumber("input bonus(1-20):", 1,20);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
    @Override
    public void outputStaff() {
        super.outputStaff(); 
        System.out.print( "-"+ bonus);
    }
    //them 1 nhan vien vao ng manager de quan li
    public boolean addStaff(Staff staff){
        if(noOfStaffs<MAX){
            stafflist[noOfStaffs]=staff;
            noOfStaffs++;
            return true;
        }
        return false;
    }
    //tim staff trong stafflist
    //input: id of staff
    //out: dia chi tim thay
    public Staff findStaff(int staffId){
        for (Staff staff : stafflist) {
            if(staff.getId()==staffId)
                return staff;
        }
        return null;
    }
    //ham nay de xuat ds staff dc manager quan li
    public void displayStaffs(){
        if(noOfStaffs>0){
          for (Staff staff : stafflist) {
            staff.outputStaff();
          }
        }
        else System.out.println("Staff list is empty");
    }
}
