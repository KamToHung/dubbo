package org.apache.dubbo.springboot.demo;

import java.io.Serializable;

/**
 * @author <a href = "kamtohung@gmail.com">KamTo Hung</a>
 */
public class User implements Serializable {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
