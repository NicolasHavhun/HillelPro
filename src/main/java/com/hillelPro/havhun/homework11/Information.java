package com.hillelPro.havhun.homework11;

import java.util.*;

public class Information {

    private ArrayList<String> userName;
    private Set<String> mail;
    private HashMap<String, String> mailName;

    public ArrayList<String> getUserName() {
        return userName;
    }

    public void setUserName(ArrayList<String> userName) {
        this.userName = userName;
    }

    public Set<String> getMail() {
        return mail;
    }

    public void setMail(Set<String> mail) {
        this.mail = mail;
    }

    public HashMap<String, String> getMailName() {
        return mailName;
    }

    public void setMailName(HashMap<String, String> mailName) {
        this.mailName = mailName;
    }

    public Information() {
    }

    public Information(ArrayList<String> userName, Set<String> mail, HashMap<String, String> mailName) {
        this.userName = userName;
        this.mail = mail;
        this.mailName = mailName;
    }
}
