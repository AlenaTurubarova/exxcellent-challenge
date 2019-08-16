package de.exxcellent.challenge.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "name")
@ToString
public class Team {

    private String name;
    private int games;
    private int wins;
    private int losses;
    private int draws;
    private int goals;
    private int goalsAllowed;
    private int points;
}
