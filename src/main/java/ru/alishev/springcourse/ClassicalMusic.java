package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static Music getClassicalMusic() {
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Peter and Wolf";
    }
}
