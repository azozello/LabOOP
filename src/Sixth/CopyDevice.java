package Sixth;

public class CopyDevice extends Device implements Cloneable{

    private int paper;

    private int ink;

    private int letters;

    public CopyDevice(int price, int age) {
        super(price, age);
    }

    public CopyDevice(int price, int age, int paper, int ink) {
        super(price, age);
        this.paper = paper;
        this.ink = ink;
        this.letters = paper*ink;
    }

    public CopyDevice(){}

    @Override
    public int totalPrice() {
        return super.totalPrice()+paper*ink;
    }

    @Override
    public int usedPrice() {
        return super.usedPrice()-letters;
    }

    @Override
    public CopyDevice clone() throws CloneNotSupportedException {
        return (CopyDevice)super.clone();
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int getInk() {
        return ink;
    }

    public void setInk(int ink) {
        this.ink = ink;
    }

    public int getLetters() {
        return letters;
    }

    public void setLetters(int letters) {
        this.letters = letters;
    }

    @Override
    public String toString() {
        return super.toString()+" | CopyDevice{" +
                "paper=" + paper +
                ", ink=" + ink +
                ", letters=" + letters +
                '}';
    }
}
