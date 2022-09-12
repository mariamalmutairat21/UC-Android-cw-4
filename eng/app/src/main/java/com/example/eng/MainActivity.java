package com.example.eng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> myList = new ArrayList<>();
    int currentstudent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView studName, studAge;
        ImageView studPic;
        Button Nextstud;

        studName = findViewById(R.id.textView);
        studAge = findViewById(R.id.textView2);
        studPic = findViewById(R.id.imageView2);
        Nextstud = findViewById(R.id.button);

        Student firstStudent = new Student("sara", 6, R.drawable.eng);
        Student secondStudent = new Student("rawan", 28, R.drawable.eng3);
        Student thirdStudent = new Student("mariam", 27, R.drawable.eng4);

        myList.add(firstStudent);
        myList.add(secondStudent);
        myList.add(thirdStudent);

        studName.setText(myList.get(currentstudent).getStudentName());
        studAge.setText(myList.get(currentstudent).getStudentAge() + "");
        studPic.setImageResource(myList.get(currentstudent).getStudentImg());

        Nextstud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentstudent++;
                if (currentstudent == myList.size()){
                    currentstudent = 0;
                }

                studName.setText(myList.get(currentstudent).getStudentName());
                studAge.setText(myList.get(currentstudent).getStudentAge() + "");
                studPic.setImageResource(myList.get(currentstudent).getStudentImg());
            }

        });

    }
}