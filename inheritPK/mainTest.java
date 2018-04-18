package inheritTest;
public class mainTest{
    public static void main(String [] args){
        fatherClass a = new fatherClass("Tom",1);
        sonClass b = new sonClass("Jim",2);
        a.eat();
        b.eat();
        b.eatTest();
    }
}