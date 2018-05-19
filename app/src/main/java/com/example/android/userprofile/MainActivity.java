package com.example.android.userprofile;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String userName = "Donald Mears";

        TextView name = findViewById(R.id.name);
        name.setText(userName);

        TextView birthday = findViewById(R.id.birthday);
        TextView country = findViewById(R.id.country);

        birthday.setText("100,009 years!");
        country.setText("Planet Earth");

        ImageView imageView = findViewById(R.id.profile_picture);
        imageView.setImageResource(R.drawable.desktop);

    }
}
