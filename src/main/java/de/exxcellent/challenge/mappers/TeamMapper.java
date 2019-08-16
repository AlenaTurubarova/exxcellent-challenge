package de.exxcellent.challenge.mappers;

import de.exxcellent.challenge.model.Team;

public class TeamMapper extends AbstractCsvMapper<Team> {

    @Override
    Team map(String[] cells) {
        Team team = new Team();
        team.setName(cells[0]);
        team.setGames(Integer.valueOf(cells[1]));
        team.setWins(Integer.valueOf(cells[2]));
        team.setLosses(Integer.valueOf(cells[3]));
        team.setDraws(Integer.valueOf(cells[4]));
        team.setGoals(Integer.valueOf(cells[5]));
        team.setGoalsAllowed(Integer.valueOf(cells[6]));
        team.setPoints(Integer.valueOf(cells[7]));
        return team;
    }

    @Override
    void validateData(String cellData) {
        if(cellData == null || cellData.isEmpty()){
            throw new IllegalArgumentException("Team Name cannot be empty.");
        }
    }
}
