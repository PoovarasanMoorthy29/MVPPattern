package com.flowerbase.practice.view;
import java.util.Scanner;
import com.flowerbase.practice.presenter.UserPresenter;

public class ViewUser implements IView {
    private Scanner sc=new Scanner(System.in);
    @Override
    public String getUserName(){
        System.out.println("Enter the name:");
        return sc.nextLine();


    }
    @Override
    public int getUserAge(){
        System.out.println("Enter the age:");
        return sc.nextInt();
    }

}
