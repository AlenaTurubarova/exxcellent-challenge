package de.exxcellent.challenge;

import de.exxcellent.challenge.mappers.Mapper;
import de.exxcellent.challenge.mappers.TeamMapper;
import de.exxcellent.challenge.mappers.WeatherDayMapper;
import de.exxcellent.challenge.model.Team;
import de.exxcellent.challenge.model.WeatherDay;
import de.exxcellent.challenge.operations.Operations;
import de.exxcellent.challenge.readers.CsvReader;
import de.exxcellent.challenge.readers.Reader;

import java.util.List;
import java.util.Optional;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        Reader<WeatherDay> dayReader = new CsvReader<>();
        Mapper<WeatherDay> dayMapper = new WeatherDayMapper();
        List<WeatherDay> days = dayReader.readFromFile("de/exxcellent/challenge/weather.csv", dayMapper);

        Optional<WeatherDay> dayWithSmallestTempSpread = Operations.findObjectWithMinParameterValue(days, WeatherDay::getMinTemperature);
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread.toString());

        Reader<Team> teamReader = new CsvReader<>();
        Mapper<Team> teamMapper = new TeamMapper();
        List<Team> teams = teamReader.readFromFile("de/exxcellent/challenge/football.csv", teamMapper);

        Optional<Team> teamWithSmallestGoalSpread = Operations.findObjectWithMinParameterValue(teams, Team::getGoals);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread.toString());
    }
}
