package com.pp1.project1;

public interface ICRUD {
    public Object add();
    public void update();
    public int delete(Object obj);
    public void selectOne(int id);
}
