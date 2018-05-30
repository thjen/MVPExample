package qthjen_dev.io.mvpexample.Presenter.Login;

import qthjen_dev.io.mvpexample.View.Login.LoginViewInterface;

/** LoginPresenter để sử lý logic **/
public class LoginPresenter implements LoginPresenterInterface {

    LoginViewInterface loginViewInterface;

    public LoginPresenter(LoginViewInterface loginViewInterface) {
        this.loginViewInterface = loginViewInterface;
    }

    @Override
    public void login(String email, String pass) {
        // gọi model để lấy dữ liệu
        if (email.equals("thjenxxxno6@gmail.com") && pass.equals("thjenit98")) {
            // trả cho view nếu đăng nhập thành công
            loginViewInterface.signInSuccess();
        } else {
            // trả cho view nếu đăng nhập thất bại
            loginViewInterface.signInError();
        }
    }
}
