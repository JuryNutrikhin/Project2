//public class Lessen19 {
//    public static void main(String[] args) {
//        Human1 human1 = new Human1();
//        human1.setName("Bob");
//        human1.setAge(11);
//        human1.speak();
//
//
//    }
//}
//
////=======================================
//
//class Human1 {
//   private String name;
//    private int age;
//
//    //============================
//
//    public void setName( String name){
//        this.name = name;
//    }
//
//    public  String getName(){
//        return name;
//    }
//    //==============================
//
//    public void  setAge(int age ){
//        this.age = age;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    //=============================
//
//    void speak(){
//        System.out.println("My name "+ name + " i am " + age + " age");
//    }
//}

public class Lessen19 {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        human1.setName("Bob");
        human1.setAge(55);
        human1.speak();

    }
}

//==========================================
class Human1{

   private String name;
    private int age;

    //===========================================


    public void setName(String name) {
            this.name = name;
    }

    public String getName(){
        return  name;
    }

    //=============================================


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //==============================================

    void speak(){
        System.out.println(name +" "+ age);
    }
}











































