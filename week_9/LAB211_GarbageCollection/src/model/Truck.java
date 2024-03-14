package model;

import java.util.ArrayList;
import java.util.List;

public class Truck implements GarbageInfo{
    private double curLoad;
    private int totalTime;
    private int totalFieldTime;
    private int curPoint;
    private List<GarbagePoint> garbagePoints;
    public Truck() {
        garbagePoints = new ArrayList<>();
    }

    public double getCurLoad() {
        return curLoad;
    }

    public void setCurLoad(double curLoad) {
        this.curLoad = curLoad;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTotalFieldTime() {
        return totalFieldTime;
    }

    public void setTotalFieldTime(int totalFieldTime) {
        this.totalFieldTime = totalFieldTime;
    }

    public int getCurPoint() {
        return curPoint;
    }

    public void setCurPoint(int curPoint) {
        this.curPoint = curPoint;
    }

    public List<GarbagePoint> getGarbagePoints() {
        return garbagePoints;
    }

    public void setGarbagePoints(List<GarbagePoint> garbagePoints) {
        this.garbagePoints = garbagePoints;
    }
    
    public double start(){
        return goNext();
    }

    public double goNext(){
        if ((curLoad + garbagePoints.get(curPoint).getgLoad()) <= MAX_LOAD){
            curLoad += garbagePoints.get(curPoint).getgLoad();
            totalTime += AVG_TIME1POINT;
            if (curPoint == (garbagePoints.size()-1)){
                goField();    
            }
            else {
                curPoint++;
                goNext();

            }
        }
        else {
            goField();
            goNext();
        }
        return getTotalFee();
    }

    public void goField(){
        curLoad = 0;
        totalFieldTime += AVG_WHOLETIME;
    }

    public double getTotalFee(){
        return (double)((SALARY/60)*(totalTime+totalFieldTime) + FEE*totalFieldTime/AVG_WHOLETIME);

    }

    public void add(GarbagePoint garbagePoint) {
        garbagePoints.add(garbagePoint);
    }

}
