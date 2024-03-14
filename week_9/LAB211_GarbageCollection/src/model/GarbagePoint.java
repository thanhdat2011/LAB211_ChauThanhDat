package model;

public class GarbagePoint {
    private int orderNum;
    private double gLoad;

    public GarbagePoint(int orderNum, double gLoad) {
        this.orderNum = orderNum;
        this.gLoad = gLoad;
    }


    public GarbagePoint(double gLoad){
        this.gLoad = gLoad;
    }
    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public double getgLoad() {
        return gLoad;
    }

    public void setgLoad(int gLoad) {
        this.gLoad = gLoad;
    }

    @Override
    public String toString() {
        return String.format("Garbage Point %s, gLoad : %s", orderNum, gLoad);
    }
}
