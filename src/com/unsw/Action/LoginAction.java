package com.unsw.Action;

import java.util.List;

public class LoginAction {
    private String username;
    private String password;

    public LoginAction(){
    }

    //    1. username 和pass 去db里边查，如果匹配，就success
    public String LoginAction(List<String> namePassPairList, String username, String password){
        if (username == namePassPairList.get(0)){
            if (password == namePassPairList.get(1)){
                return "success";
            }
        }
        return "fail";
    }




    public String execute() throws Exception{
        return "success";
    }
    public String getUsername(){
        return username;
    }
}
