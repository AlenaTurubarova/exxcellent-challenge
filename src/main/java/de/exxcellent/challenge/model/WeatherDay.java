package de.exxcellent.challenge.model;

public class WeatherDay {

    private int dayNumber;
    private int maxTemperature;
    private int minTemperature;
    private int averageTemperature;
    private double AvDP;
    private int HrPTPcpn;
    private int PDir;
    private double AvSp;
    private int Dir;
    private int MxS;
    private double SkyC;
    private int MxR;
    private int MnR;
    private double AvSLP;

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAvDP() {
        return AvDP;
    }

    public void setAvDP(double avDP) {
        AvDP = avDP;
    }

    public int getHrPTPcpn() {
        return HrPTPcpn;
    }

    public void setHrPTPcpn(int hrPTPcpn) {
        HrPTPcpn = hrPTPcpn;
    }

    public int getPDir() {
        return PDir;
    }

    public void setPDir(int PDir) {
        this.PDir = PDir;
    }

    public double getAvSp() {
        return AvSp;
    }

    public void setAvSp(double avSp) {
        AvSp = avSp;
    }

    public int getDir() {
        return Dir;
    }

    public void setDir(int dir) {
        Dir = dir;
    }

    public int getMxS() {
        return MxS;
    }

    public void setMxS(int mxS) {
        MxS = mxS;
    }

    public double getSkyC() {
        return SkyC;
    }

    public void setSkyC(double skyC) {
        SkyC = skyC;
    }

    public int getMxR() {
        return MxR;
    }

    public void setMxR(int mxR) {
        MxR = mxR;
    }

    public int getMnR() {
        return MnR;
    }

    public void setMnR(int mnR) {
        MnR = mnR;
    }

    public double getAvSLP() {
        return AvSLP;
    }

    public void setAvSLP(double avSLP) {
        AvSLP = avSLP;
    }

    @Override
    public String toString() {
        return "WeatherDay{" +
                "dayNumber=" + dayNumber +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                ", averageTemperature=" + averageTemperature +
                ", AvDP=" + AvDP +
                ", HrPTPcpn=" + HrPTPcpn +
                ", PDir=" + PDir +
                ", AvSp=" + AvSp +
                ", Dir=" + Dir +
                ", MxS=" + MxS +
                ", SkyC=" + SkyC +
                ", MxR=" + MxR +
                ", MnR=" + MnR +
                ", AvSLP=" + AvSLP +
                '}';
    }
}
