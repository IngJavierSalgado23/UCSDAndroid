package ucsd.android.certificate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SuccesfulLogin extends AppCompatActivity implements View.OnClickListener{
    ImageButton buttonLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succesful_login);
        setup();
    }

    private void setup()
    {
        buttonLogout = findViewById(R.id.buttonLogout);
        buttonLogout.setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }

}
