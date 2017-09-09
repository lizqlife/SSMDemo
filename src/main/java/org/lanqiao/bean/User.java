package org.lanqiao.bean;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

/**
 * Created by lizq on 2017/8/30.
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String pass;
    private Integer sex;

    public void printHello(){
        System.out.println("Spring 4 : Hello ! " + name);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", Sex=" + sex +
                '}';
    }
}
