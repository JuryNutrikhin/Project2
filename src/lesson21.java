//public class lesson21 {
//    public static void main(String[] args){
//        Human2 h1 = new Human2("Bob",33);
//        Human2 h2 = new Human2("Jhon",8);
//        Human2 h3 = new Human2("Mam ",80);
//        h1.print();
//        h2.print();
//        h3.print();
//
//    }
//}
//
////====================================
//
//class Human2 {
//    private String name;
//    private int age;
//
//    private static int cauntPeople;
//
//    public Human2 (String name, int age ){
//        this.name = name;
//        this.age = age;
//        cauntPeople++;
//    }
//
//    public void print(){
//        System.out.println( name +" "+ age + " "+ cauntPeople);
//    }
//
//}


//=======================================================
public class lesson21 {

    public static void main(String[] args) {

        Human2 h1 = new Human2("Bob", 34);
        Human2 h2 = new Human2("Mary");
        h1.speak();
        h2.speak();


    }

}

//===================================================

class Human2 {

    private String name;
    private int age;

    private static int cauntPeople;

    public Human2(String name) {

        this.name = name;

    }

    public Human2(String name, int age) {

        this.name = name;
        this.age = age;
        cauntPeople++;

    }

    public void speak() {
        System.out.println(name + " " + age + " " + cauntPeople);
    }

}





































