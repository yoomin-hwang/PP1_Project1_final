package com.pp1.project1;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;

    WordManager() {
        wordCRUD = new WordCRUD(s);
    }

    public int selectMenu() {
        System.out.println("*** 영단어 마스터 ***\n"
                + "*********************\n"
                + "1. 모든 단어 보기\n"
                + "2. 수준별 단어 보기\n"
                + "3. 단어 검색\n"
                + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                + "*********************\n"
                + "=> 원하는 메뉴는? ");
        return s.nextInt();
        // void selectMenu
        // int menu = s.nextInt();
    }

    public void start() {
        wordCRUD.loadFile();
        while(true){
            int menu = selectMenu();
            if(menu == 0){
                System.out.println("프로그램 종료! 다음에 만나요~");
                break;
            }
            switch (menu) {
                case 1 -> {                         // list all
                    wordCRUD.listAll();
                }
                case 2 -> {                         // list same level
                    wordCRUD.listLevel();
                }
                case 3 -> {                         // retrieve word
                    String keyword;
                    System.out.println("=> 검색할 단어 입력 : ");
                    keyword = s.next();
                    wordCRUD.retrieve(keyword);
                }
                case 4 -> wordCRUD.addWord();       // add word
                case 5 -> {                         // update word
                    wordCRUD.update();
                }
                case 6 -> {                         // delete word
                    wordCRUD.delete();
                }
                case 7 -> {                         // file in and out

                }
            }
        }
    }
}
