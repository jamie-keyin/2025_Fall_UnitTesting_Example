package com.keyin;

import java.util.Calendar;
import java.util.Objects;

public class Division {
    private long id;
    private String name;
    private String startBirthYear;
    private String endBirthYear;

    public boolean isPlayerEligible(Player player) {
        Calendar playerBirthday = player.getBirthday();

        if (playerBirthday != null) {
            String playerBirthYear = String.valueOf(playerBirthday.get(Calendar.YEAR));

            return Integer.parseInt(startBirthYear) <= Integer.parseInt(playerBirthYear) &&
                    Integer.parseInt(endBirthYear) >= Integer.parseInt(playerBirthYear);
        }

        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Division division = (Division) o;
        return Objects.equals(name, division.name) && Objects.equals(startBirthYear, division.startBirthYear) && Objects.equals(endBirthYear, division.endBirthYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startBirthYear, endBirthYear);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartBirthYear() {
        return startBirthYear;
    }

    public void setStartBirthYear(String startBirthYear) {
        this.startBirthYear = startBirthYear;
    }

    public String getEndBirthYear() {
        return endBirthYear;
    }

    public void setEndBirthYear(String endBirthYear) {
        this.endBirthYear = endBirthYear;
    }
}
