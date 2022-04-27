package by.itstep.elena.mega.shop.project.data;

public class Milk {
    private int wolum;
    private double fat;
    private double money;

    public Milk() {

    }

    public Milk(int wolumm, double fat, double money) {
        this.wolum = wolumm;
        this.fat = fat;
        this.money = money;
    }

    public int getWolum() {
        return wolum;
    }

    public void setWolum(int wolum) {
        this.wolum = wolum;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Milk: " +
                "wolum = " + wolum +
                ", fat = " + fat +
                ", money = " + money +
                " ";
    }
}

