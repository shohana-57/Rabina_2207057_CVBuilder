package com.example.rabina_2207057_cvbuilder;

public class JsonUtil {
    public JsonUtil(String jsonData) {
    }


    public String getString(String fullname) {
        return"";
    }

    public static String toJson(String name, String father, String mother, String email, String address, String number, Integer date, String exam1, String B1, String G1, String GPA1, String Y1,String exam2, String B2, String G2, String GPA2, String Y2, String exam3, String U1, String D1, String CGPA1, String Y3, String exam4, String U2, String D2, String CGPA2, String Y4) {
        return "{ \"Fullname\":" + name + ","
                + " \"Fathername\":" + father + ","
                + " \"Mothername\":" + mother + ","
                + " \"Email\":" + email + ","
                + " \"Address\":" + address + ","
                + " \"Contact Number\":" + number + ","
                + " \"Date of Birth\":" + date + ","
                + " \"Exam1\":" + exam1 + ","
                + " \"Board1\":" + B1 + ","
                + " \"Group1\":" + G1 + ","
                + " \"GPA1\":" + GPA1 + ","
                + " \"Year1\":" + Y1 + ","
                + " \"Exam2\":" + exam2 + ","
                + " \"Board2\":" + B2 + ","
                + " \"Group2\":" + G2 + ","
                + " \"GPA2\":" + GPA2 + ","
                + " \"Year2\":" + Y2 + ","
                + " \"Exam3\":" + exam3 + ","
                + " \"University1\":" + U1 + ","
                + " \"Department1\":" + D1 + ","
                + " \"CGPA1\":" + CGPA1 + ","
                + " \"Year3\":" + Y3 + ","
                + "  \"Exam4\":" + exam4 + ","
                + " \"University2\":" + U2 + ","
                + " \"Department2\":" + D2 + ","
                + " \"CGPA2\":" + CGPA2 + ","
                + " \"Year4\":" + Y4 +"}";
    }
}
