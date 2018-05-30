package qthjen_dev.io.mvpexample.View.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import qthjen_dev.io.mvpexample.Presenter.Login.LoginPresenter;
import qthjen_dev.io.mvpexample.R;
import qthjen_dev.io.mvpexample.View.LoadListMain.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginViewInterface {

    EditText email, pass;
    Button login;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.signIn);

        loginPresenter = new LoginPresenter(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.login(email.getText().toString(), pass.getText().toString());
            }
        });
    }

    @Override
    public void signInSuccess() {
        Toast.makeText(this, "Successfully", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void signInError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}
