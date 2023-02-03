package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer() {}
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(ArrayList musicList) {
        this.musicList = musicList;
    }
    public void playMusicList() {
        System.out.println("Playing play list:");
        for (Music music:musicList) {
            System.out.println(music.getSong());
        }
    }
}
