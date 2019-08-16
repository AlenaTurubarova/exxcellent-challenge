package de.exxcellent.challenge;

import de.exxcellent.challenge.mappers.Mapper;
import de.exxcellent.challenge.mappers.TeamMapper;
import de.exxcellent.challenge.mappers.WeatherDayMapper;
import de.exxcellent.challenge.model.Team;
import de.exxcellent.challenge.model.WeatherDay;
import de.exxcellent.challenge.readers.CsvReader;
import de.exxcellent.challenge.readers.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example JUnit4 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public class AppTest {

    private String successLabel = "not successful";
    private static final String WEATHER_FILE_PATH = "de/exxcellent/challenge/weather.csv";
    private static final String FOOTBALL_FILE_PATH = "de/exxcellent/challenge/football.csv";

    private List<WeatherDay> days;
    private List<Team> teams;

    @BeforeEach
    public void setUp() {
        Reader<WeatherDay> dayReader = new CsvReader<>();
        Mapper<WeatherDay> dayMapper = new WeatherDayMapper();
        days = dayReader.readFromFile(WEATHER_FILE_PATH, dayMapper);

        Reader<Team> teamReader = new CsvReader<>();
        Mapper<Team> teamMapper = new TeamMapper();
        teams = teamReader.readFromFile(FOOTBALL_FILE_PATH, teamMapper);
    }

    @Test
    public void teamsNumberInListShouldEqualFootballCSVRowsNumber() throws FileNotFoundException {
        assertEquals(getNumberOfRowsFromCSV(FOOTBALL_FILE_PATH), teams.size(), "Not all teams were read from CSV");
    }

    @Test
    public void daysNumberInListShouldEqualWeatherCSVRowsNumber() throws FileNotFoundException {
        assertEquals(getNumberOfRowsFromCSV(WEATHER_FILE_PATH), days.size(), "Not all days were read from CSV");
    }

    @Test
    public void runFootball() {
        App.main("--football", "football.csv");
    }

    private int getNumberOfRowsFromCSV(String filePath) throws FileNotFoundException {
        File file = new File(Objects.requireNonNull(getClass().getClassLoader().getResource(filePath)).getFile());
        InputStream inputStream = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        return  (int) br.lines().count() - 1;
    }

}