package chop2;
//封装
public class index {
    private int id;
    private String name;

    public index(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public index() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //重载
    public void show(){
        System.out.println("1");
    }
    public int show(int a){
        System.out.println("2");
        return a;
    }
}
