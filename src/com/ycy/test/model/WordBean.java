package com.ycy.test.model;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/14 23:59
 * @Description: TODO
 **/
public class WordBean {
    private int id;
    private String words;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "WordBean{" +
                "id=" + id +
                ", words='" + words + '\'' +
                '}';
    }
}
