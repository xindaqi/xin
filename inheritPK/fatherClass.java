package inheritTest;
public class fatherClass {
    private String name;
    private int id;
    public void fatherClass(String myName, int myid){
        name = myName;
        id = myid;
    }
    public void eat(){
        System.out.println(name+" can not eat anything!");
    }
    public void sleep(){
        System.out.println(name+" is sleeping!");
    }

}