package com.example.rabina_2207057_cvbuilder;

import java.time.LocalDate;

public class CVNode {
    private  String jsonData;
    private  int id;
    private  String trim;
    private  String trim1;
    private  String trim2;
    private  String trim3;
    private  String trim4;
    private  String trim5;
    private  String date;
    private  String text;
    private  String text1;
    private  String text2;
    private  String text3;
    private  String text4;
    private  String text5;
    private  String text6;
    private  String text7;
    private  String text8;
    private  String text9;
    private  String text10;
    private  String text11;
    private  String text12;
    private  String text13;
    private  String text14;
    private  String text15;
    private  String text16;
    private  String text17;
    private  String text18;
    private  String text19;
    private  String text20;
    private  String text21;
    private  String text22;
    private  String text23;


    public CVNode(int id, String trim, String trim1, String trim2, String trim3, String trim4,String trim5,String date, String text, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String text12, String text13, String text14, String text15, String text16, String text17, String text18, String text19, String text20, String text21, String text22) {
        this.id=id;
        this.trim=trim;
        this.trim1=trim1;
        this.trim2=trim2;
        this.trim3=trim3;
        this.trim4=trim4;
        this.trim5=trim5;
        this.date=date;
        this.text=text;
        this.text1=text1;
        this.text2=text2;
        this.text3=text3;
        this.text4=text4;
        this.text5=text5;
        this.text6=text6;
        this.text7=text7;
        this.text8=text8;
        this.text9=text9;
        this.text10=text10;
        this.text11=text11;
        this.text12=text12;
        this.text13=text13;
        this.text14=text14;
        this.text15=text15;
        this.text16=text16;
        this.text17=text17;
        this.text18=text18;
        this.text19=text19;
        this.text20=text20;
        this.text21=text21;
        this.text22=text22;
        this.text23=text23;
    }

    public CVNode(int id,String fullName,String jsonData){
        this.id=id;
        this.trim=fullName;
        this.jsonData=jsonData;
    }

    public String getJsonData(){
        return jsonData;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return trim;
    }

    public String getFatherName() {
        return trim1;
    }

    public String getMotherName() {
        return trim2;
    }

    public String getEmail() {
        return trim3;
    }

    public String getAddress() {
        return trim4;
    }

    public String getContactNumber() {
        return trim5;
    }

    public String getDateofBirth() {
        return date;
    }

    public String getExam1() {
        return text;
    }

    public String getB1() {
        return text1;
    }

    public String getFG1() {
        return text2;
    }

    public String getGPA1() {
        return text3;
    }

    public String getY1() {
        return text4;
    }

    public String getExam2() {
        return text5;
    }

    public String getB2() {
        return text6;
    }

    public String getG2() {
        return text7;
    }

    public String getGPA2() {
        return text8;
    }

    public String getY2() {
        return text9;
    }

    public String getExam3() {
        return text10;
    }

    public String getU1() {
        return text11;
    }

    public String getD1() {
        return text12;
    }

    public String getCGPA1() {
        return text13;
    }

    public String getY3() {
        return text14;
    }


    public String getExam4() {
        return text15;
    }


    public String getU2() {
        return text16;
    }

    public String getD2() {
        return text17;
    }

    public String getCGPA2() {
        return text18;
    }

    public String getY4() {
        return text19;
    }

    public String getSkills() {
        return text20;
    }

    public String getExperience() {
        return text21;
    }

    public String getProjects() {
        return text22;
    }

    public void setFullName(String fullName){
        this.trim=fullName;
    }
    public void setJsonData(String jsonData){
        this.jsonData=jsonData;
    }

   public String toString(){
        return trim;
   }


}
