package com.forbitbd.jsonparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    String JSON_STRING = "{\"student\":{\"name\":\"vikas\",\"roll\":\"10\",\"age\":\"25\",\"gender\":\"male\",\"address\":\"Delhi\",\"pin\":\"110054\",\"work\":\"business\",\"country\":\"india\"}}";
    String name, roll, age, gender, address, pin, work, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.parse);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    JSONObject jsonObject = new JSONObject(JSON_STRING);
                    JSONObject details = jsonObject.getJSONObject("student");
                    name = details.getString("name");
                    roll = details.getString("roll");
                    age = details.getString("age");
                    gender = details.getString("gender");
                    address = details.getString("address");
                    pin = details.getString("pin");
                    work = details.getString("work");
                    country = details.getString("country");

                    textView.setText(name+"\n"+roll+"\n"+age+"\n"+gender+"\n"+address+"\n"+pin+"\n"+work+"\n"+country);
                } catch (Exception e) {

                }
            }
        });
    }
}