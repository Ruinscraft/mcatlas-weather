package net.mcatlas.weather.model;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class Forecast {

    private String time;
    private Location location;
    private Coordinate irlLocation;
    private Category category;
    private double windsMph;

    public Forecast(String time, double lat, double lon, Category category, double windSpeed) {
        this.time = time;
        this.irlLocation = new Coordinate(lat, lon);
        Coordinate ingame = Coordinate.getMCFromLife(lat, lon);
        this.location = new Location(Bukkit.getWorlds().get(0), ingame.getX(), 64, ingame.getY());
        this.category = category;
        this.windsMph = windSpeed;
    }

    public String getTime() {
        return time;
    }

    public Location getLocation() {
        return location;
    }

    public Coordinate getIrlLocation() {
        return irlLocation;
    }

    public Category getCategory() {
        return this.category;
    }

    public double getWindsMph() {
        return windsMph;
    }
}
