package de.exxcellent.challenge.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "dayNumber")
@ToString
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
}
