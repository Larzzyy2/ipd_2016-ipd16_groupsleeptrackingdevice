package com.example.bollez.sleeptrackingdevice;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class LoginActivity extends Activity {
    EditText username;
    EditText password;
    Button login;
    int Attempts;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.loginbutton);
        Attempts = 3;




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Attempts != 0) {
                    if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {

                        //correct
                    } else {
                        //wrong password
                        Attempts--;
                    }
                }
                else
                {
                    login.setEnabled(false);
                }
            }
        });
    }


}