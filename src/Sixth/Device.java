package Sixth;

public abstract class Device {

    private int price;

    private int age;

    private int usage;

    public int getPrice() {
        return price;
    }

    public Device(int price, int age) {
        this.price = price;
        this.age = age;
        this.usage = age * price;
    }

    public Device(){}

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public int totalPrice(){
        return price*usage;
    }

    public int usedPrice(){
        return price/age;
    }

    @Override
    public String toString() {
        return "Device{" +
                "price=" + price +
                ", age=" + age +
                ", usage=" + usage +
                '}';
    }
}
