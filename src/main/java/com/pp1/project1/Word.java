package com.pp1.project1;

public class Word {
    private int id;
    private int level;
    private String word;
    private String def;         //definition

    public Word(int id, int level, String word, String def) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.def = def;
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

    @Override
    public String toString() {
        String slevel = "";
        for(int i=0; i<level; i++) slevel += "*";
        return String.format("%-3s", slevel)
                + String.format("%15s", word) + "  " + def;
    }
    public String toFileString(){
        return this.level + "|" + this.word + "|" + this.def;
    }
}
