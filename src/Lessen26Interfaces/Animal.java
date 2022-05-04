package Lessen26Interfaces;

public class Animal implements Info {
    public int id;

    public Animal( int id){
        this.id =id;
    }

    public void sleep(){
        System.out.println( "Animal is sleep");
    }
    public void showInfo(){
        System.out.println(" iD is "+ this.id);
    }
}
