package com.example.asl_project.Model;

public class AslModel {
    public AslModel() {
    }

    int aslImage;
    int id;

    String aslAlphabet;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AslModel(int id, int aslImage, String aslAlphabet) {
        this.aslImage = aslImage;
        this.id = id;
        this.aslAlphabet = aslAlphabet;
    }

    public AslModel(int aslImage, String aslAlphabet) {
        this.aslImage = aslImage;
        this.aslAlphabet = aslAlphabet;
    }

    public int getAslImage() {
        return aslImage;
    }

    public void setAslImage(int aslImage) {
        this.aslImage = aslImage;
    }

    public String getAslAlphabet() {
        return aslAlphabet;
    }

    public void setAslAlphabet(String aslAlphabet) {
        this.aslAlphabet = aslAlphabet;
    }
}
