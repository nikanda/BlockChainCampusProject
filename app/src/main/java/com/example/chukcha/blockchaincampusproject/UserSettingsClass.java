package com.example.chukcha.blockchaincampusproject;

public class UserSettingsClass {
    static String countryTxt;
    static String age;
    private static String gender;
    private static String education;

    public static String getCountryTxt() {
        return countryTxt;
    }

    public static void setCountryTxt(String countryTxt) {
        UserSettingsClass.countryTxt = countryTxt;
    }

    public static String getAge() {
        return age;
    }

    public static void setAge(String age) {
        UserSettingsClass.age = age;
    }


    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        UserSettingsClass.gender = gender;
    }

    public static String getEducation() {
        return education;
    }

    public static void setEducation(String education) {
        UserSettingsClass.education = education;
    }
}
