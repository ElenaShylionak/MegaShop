package by.itstep.elena.mega.shop.project.data;

public class Box {
    private Orange[] oranges;
    private  Milk [] milks;

    public Box(){
        oranges = new Orange[0];
        milks =new Milk[0];
    }
    public Box( Orange[] oranges, Milk[] milks){
        this.milks = milks;
        this.oranges = oranges;
    }

    public void add(Orange orange) {
        Orange[] temp = new Orange[oranges.length + 1];
        int i = 0;
        for (; i < oranges.length; i++) {
            temp[i] = oranges[i];

        }
        temp[i] = orange;
        oranges = temp;

    }

}
