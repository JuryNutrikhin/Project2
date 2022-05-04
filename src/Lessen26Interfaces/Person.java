package Lessen26Interfaces;

public class Person implements Info {
    public String name;

    public Person (String name){
        this.name = name;
    }

    public void  sayHello(){
        System.out.println(" Person  say Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+ name);

    }
}
