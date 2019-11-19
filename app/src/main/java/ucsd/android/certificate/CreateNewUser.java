package ucsd.android.certificate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class CreateNewUser extends AppCompatActivity implements View.OnClickListener {
    Button buttonCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_user);
        setup();
    }
    private void setup(){
        buttonCreate =  findViewById(R.id.buttonCreate);
        buttonCreate.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);

    }
}
