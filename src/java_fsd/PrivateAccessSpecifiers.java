package java_fsd;

class Data {
    private String name;

    public String getName() {// getter method
        return this.name;
    }
   
    public void setName(String name) {  // setter method
        this.name= name;
    }
}
public class PrivateAccessSpecifiers {
    public static void main(String[] main){
        Data d = new Data();
        d.setName("Java Programming");
        System.out.println(d.getName());
    }
}