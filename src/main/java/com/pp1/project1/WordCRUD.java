package com.pp1.project1;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    ArrayList<Word> list;
    Scanner s;

    WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }

    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();         // next으로 입력 받을 경우, 문자 뒤의 ENTER은 처리되지 않아서 이후 코드에 나오는 nextLine으로 입력 받는 문자열에 문제가 발생

        System.out.print("뜻 입력 : ");
        String def = s.nextLine();
        return new Word(0, level, word, def);
    }

    public void addWord() {
        Word one = (Word)add();
        list.add(one);
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다. ");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll() {
        System.out.println("---------------------------------");
        for(int i=0; i<list.size(); i++){
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("---------------------------------");
    }

    public void listLevel() {
        System.out.println("---------------------------------");
    }
}
