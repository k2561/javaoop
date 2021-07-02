package chop1;

public class Teacher {
    private int tid;
    private  String tname;
    private  int tage;
    private  String address;

    public Teacher() {
    }

    public Teacher(int tid, String tname, int tage, String address) {
        this.tid = tid;
        this.tname = tname;
        this.tage = tage;
        this.address = address;
    }

    public int getTid() {
        return tid;
    }

    public String getTname() {
        return tname;
    }

    public int getTage() {
        return tage;
    }

    public String getAddress() {
        return address;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
