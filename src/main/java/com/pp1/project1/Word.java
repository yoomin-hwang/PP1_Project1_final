package com.pp1.project1;

public class Word {
    private int id;
    private int level;
    private String word;
    private String def;         //definition
    public Word link;

    public Word(int id, int level, String word, String def, Word link) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.def = def;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getWord() {
        return word;
    }

    public String getDef() {
        return def;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
