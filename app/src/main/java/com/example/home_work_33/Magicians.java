package com.example.home_work_33;

public class Magicians {
    private String name;
    private String grade;
    private String image;

    public Magicians(String name, String grade, String image) {
        this.name = name;
        this.grade = grade;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
