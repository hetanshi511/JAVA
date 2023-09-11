
interface Recycable {
    default void display(){
        System.out.println("Give proper input");
    }
}
class Fabric implements Recycable{
    public String toString(){
        return "Fabric";
    }
}
class Bottle implements Recycable{
     public String toString(){
        return "Bottle";
    }
}
class Paper implements Recycable{
     public String toString(){
        return "Paper";
    }
}

