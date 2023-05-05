package com.example.whattoplay.videogame;

public class Videogame {
    private Long id;
    private String name;
    private String poster;
    private Integer achievements;

    public Videogame() {
    }

    public Videogame(Long id, String name, String poster, Integer achievements) {
        this.id = id;
        this.name = name;
        this.poster = poster;
        this.achievements = achievements;
    }

    public Videogame(String name, String poster, String description, Integer achievements) {
        this.name = name;
        this.poster = poster;
        this.achievements = achievements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Integer getAchievements() {
        return achievements;
    }

    public void setAchievements(Integer achievements) {
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", achievements=" + achievements +
                '}';
    }
}
