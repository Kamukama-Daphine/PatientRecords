package www.softcodes.patientrecords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_settings);
    }

    public void editprofile(View view) {
        startActivity(new Intent(DoctorSettings.this, EditProfile.class));
    }

    public void logout(View view) {
        startActivity(new Intent(DoctorSettings.this, SignIn.class));
    }
}
