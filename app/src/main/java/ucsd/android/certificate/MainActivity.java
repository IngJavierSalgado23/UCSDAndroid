package ucsd.android.certificate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonLogin, buttonCreateUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
    }
    private void setup()
    {
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
        buttonCreateUser = (Button) findViewById(R.id.buttonCreateUser);
        buttonCreateUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.buttonCreateUser:
                System.out.println("Starting create Actiovity");
                Intent createUser = new Intent(this, CreateNewUser.class);
                startActivity(createUser);
                break;
            case R.id.buttonLogin:
                Intent login = new Intent(this,SuccesfulLogin.class);
                startActivity(login);
                break;
        }
    }
}
