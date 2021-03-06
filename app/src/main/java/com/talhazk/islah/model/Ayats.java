package com.talhazk.islah.model;

/**
 * Created by Talhazk on 26-Mar-16.
 */
public class Ayats {
    int status;
    int ayatId;
    String ayatTitle;
    String  islahAudio;
    String ayatNo;
    String catId;
    public Ayats(int status,int ayatId, String ayatTitle,String ayatNo, String islahAudio,String catId) {
        this.ayatId = ayatId;
        this.ayatTitle = ayatTitle;
        this.islahAudio = islahAudio;
        this.ayatNo = ayatNo;
        this.status = status;
        this.catId = catId;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public int getAyatId() {
        return ayatId;
    }

    public void setAyatId(int ayatId) {
        this.ayatId = ayatId;
    }

    public String getAyatNo() {
        return ayatNo;
    }

    public void setAyatNo(String ayatNo) {
        this.ayatNo = ayatNo;
    }

    public String getAyatTitle() {
        return ayatTitle;
    }

    public void setAyatTitle(String ayatTitle) {
        this.ayatTitle = ayatTitle;
    }

    public String getIslahAudio() {
        return islahAudio;
    }

    public void setIslahAudio(String islahAudio) {
        this.islahAudio = islahAudio;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
