package by.itstep.elena.mega.shop.project.data;

public class Orange {
    private int diametr;
    private int vitaminC;
    private double cost;

    public Orange(){


    }
    public Orange(int diametr, int vitaminC, double cost) {
        this.diametr = diametr;
        this.vitaminC = vitaminC;
        this.cost = cost;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(int vitaminC) {
        this.vitaminC = vitaminC;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Orange: " +
                "diametr = " + diametr +
                ", vitaminC = " + vitaminC +
                ", cost = " + cost +
                " ";
    }
}
