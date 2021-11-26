package hu.consumeSoldierAPI.domain;

import java.util.Date;

public class Soldier {
    private int id;
    private String rank;
    private int badges;
    private Date birthdate;
    private String weapon;
    private boolean intact;

    public Soldier(){}

    public Soldier(Date birthdate, String rank, String weapon, int badges) {
        this.rank = rank;
        this.badges = badges;
        this.birthdate = birthdate;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isIntact() {
        return intact;
    }

    public void setIntact(boolean intact) {
        this.intact = intact;
    }
}
