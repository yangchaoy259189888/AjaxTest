package com.ycy.test.model;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/15 15:54
 * @Description: TODO
 **/
public class CityBean {
    private int id;
    private int pid;
    private String cname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "id=" + id +
                ", pid=" + pid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
