package com.gourav.library.management.Util;

import com.gourav.library.management.DataAccessLayer.User;

public class UserValidator {

    public static boolean isValidUser(User user){
        if(user.getEmail()==null || user.getEmail()=="")
            return false;
        else return true;
    }
}
