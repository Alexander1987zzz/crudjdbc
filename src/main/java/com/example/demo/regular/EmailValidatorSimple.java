package com.example.demo.regular;

import com.example.demo.exception.FirstException;
import com.example.demo.model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidatorSimple {

    private static final String EMAIL_PATTERN = "^(.+)@(\\S+)$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean isValid(final User email) {
        Matcher matcher = pattern.matcher((CharSequence) email);
        return matcher.matches();
    }


}
