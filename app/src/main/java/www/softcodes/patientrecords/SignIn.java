package www.softcodes.patientrecords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();
    }

    public void signup(View view) {
        startActivity(new Intent(SignIn.this, Signup.class));
    }

    public void login(View view) {
        startActivity(new Intent(SignIn.this, Homeuser.class));
    }
}
