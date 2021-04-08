package com.example.coba_aja_10118331.Presenter;


import com.example.coba_aja_10118331.Model.User;
import com.example.coba_aja_10118331.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
    }
    @Override
    public boolean onLogin(String email, String password) {
        User user = new User(email, password);
        boolean isLoginSuccess = user.ValidData();

        if (isLoginSuccess)
        {
            loginView.onLoginResult("Login Berhasil");
        }
        else
        {
            loginView.onLoginResult("Login Gagal");
        }

        return isLoginSuccess;
    }
}
