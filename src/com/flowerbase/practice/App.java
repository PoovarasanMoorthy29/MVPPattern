package com.flowerbase.practice;

import com.flowerbase.practice.presenter.UserPresenter;
import com.flowerbase.practice.view.ViewUser;



public class App {
    public static void main(String[] args) {
        ViewUser view=new ViewUser();
        UserPresenter ganesh =new UserPresenter(view);
        ganesh.getDetails();





    }
}
