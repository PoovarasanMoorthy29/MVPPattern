package com.flowerbase.practice.presenter;


import com.flowerbase.practice.view.IView;
import com.flowerbase.practice.view.ViewUser;

public class UserPresenter {
    private IView view;
    public UserPresenter(IView view){
        this.view =view;
    }
    public void getDetails(){
        String UserName=view.getUserName();
        int UserAge= view.getUserAge();
        System.out.println("UserName: "+UserName);
        System.out.println("User Age: "+UserAge);
    }

}
