package inheritTest;
public class sonClass extends fatherClass{
    public sonClass(String myName, int myid){
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println("我是子类的eat方法");
    }
    public void eatTest(){
        super.eat();//调用父类构造方法
        this.eat();//调用自身类的方法
    }
}