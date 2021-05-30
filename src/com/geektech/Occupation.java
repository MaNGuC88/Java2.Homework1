package com.geektech;

public class Occupation {

    // сложный тип данных
    private String job;
    private String education;

    public Occupation(String job, String education) {
        this.job = job;
        this.education = education;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
