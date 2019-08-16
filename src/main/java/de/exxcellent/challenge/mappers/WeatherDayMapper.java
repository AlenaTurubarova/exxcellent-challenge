package de.exxcellent.challenge.mappers;

import de.exxcellent.challenge.model.WeatherDay;

public class WeatherDayMapper extends AbstractCsvMapper<WeatherDay> {

    @Override
    WeatherDay map(String[] cells) {
        WeatherDay day = new WeatherDay();
        day.setDayNumber(Integer.valueOf(cells[0]));
        day.setMaxTemperature(Integer.valueOf(cells[1]));
        day.setMinTemperature(Integer.valueOf(cells[2]));
        day.setAverageTemperature(Integer.valueOf(cells[3]));
        day.setAvDP(Double.valueOf(cells[4]));
        day.setHrPTPcpn(Integer.valueOf(cells[5]));
        day.setPDir(Integer.valueOf(cells[6]));
        day.setAvSp(Double.valueOf(cells[7]));
        day.setDir(Integer.valueOf(cells[8]));
        day.setMxS(Integer.valueOf(cells[9]));
        day.setSkyC(Double.valueOf(cells[10]));
        day.setMxR(Integer.valueOf(cells[11]));
        day.setMnR(Integer.valueOf(cells[12]));
        day.setAvSLP(Double.valueOf(cells[13]));
        return day;
    }

    @Override
    void validateData(String cellData) {
        if(Integer.valueOf(cellData) == 0){
            throw new IllegalArgumentException("Day Number cannot be zero.");
        }
    }
}
