package task3;

public class Magazine implements Printable{

    private String type;

    public Magazine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println(this.type + "----- magazine");
    }
}
