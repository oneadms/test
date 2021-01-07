package com.example.test;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.security.Permission;

public class CameraActivity extends AppCompatActivity {

    private Button camera_btn;
    private ImageView camera_image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_activity);
        camera_btn = findViewById(R.id.camera_btn);
        camera_image = findViewById(R.id.camera_image);
        camera_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(it, 1);
            }
        });
        requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"},2);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 1:
                switch (resultCode) {
                    case RESULT_OK:
                        camera_image.setImageBitmap((Bitmap) data.getExtras().get("Data"));
                }
        }

    }
}
