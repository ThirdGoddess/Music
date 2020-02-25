package com.chengyinan.music.bean;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-18 21:13
 */
public class HotDataBean {
    private int ranking;
    private String id;
    private String musicName;
    private String author;
    private String photo;

    public HotDataBean(int ranking, String id, String musicName, String author, String photo) {
        this.ranking = ranking;
        this.id = id;
        this.musicName = musicName;
        this.author = author;
        this.photo = photo;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
