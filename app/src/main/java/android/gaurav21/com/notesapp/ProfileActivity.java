package android.gaurav21.com.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.material.textfield.TextInputEditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {
    CircleImageView circleImageView;
    Button updateProfileButton;
    TextInputEditText displayNameEditText;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        circleImageView = findViewById(R.id.circleImageView);
        updateProfileButton = findViewById(R.id.updateProfileButton);
        displayNameEditText = findViewById(R.id.displayNameEditText);
        progressBar = findViewById(R.id.progressBar);
    }

    public void updateProfile(View view) {
    }
}