package com.knockoutzone.backend.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    private static final Pattern EMAIL_PATTERN=Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
    private static final Pattern PHONE_PATTERN=Pattern.compile("^[6-9]\\d{9}$");
    private static final Pattern SLUG_PATTERN=Pattern.compile("^[a-z0-9]+(?:-[a-z0-9]*$)");

    private ValidationUtil(){

    }

    public static boolean isValidEmail(String email){
        return email!=null && EMAIL_PATTERN.matcher(email).matches();
    }
    public static boolean isValidPhoneNumber(String phone){
        return phone!=null && PHONE_PATTERN.matcher(phone).matches();
    }
    public static boolean isValidSlug(String slug){
        return slug!=null && SLUG_PATTERN.matcher(slug).matches();
    }

    public static boolean isValidLength(String value,int min,int max){
        return value!=null && value.length()>=min && value.length()<=max;
    }
    public static boolean matchesRegex(String regex,String value){
        return value!=null && Pattern.matches(regex,value);
    }

}
