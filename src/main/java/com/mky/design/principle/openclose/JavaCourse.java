package com.mky.design.principle.openclose;

/**
 * @author makaiyu
 * @date 2020-05-03 12:13
 */
public class JavaCourse implements ICourse {

    private Integer id;

    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }


}
