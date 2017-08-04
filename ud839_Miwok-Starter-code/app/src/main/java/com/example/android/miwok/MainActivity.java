/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Finds the view that shows the numbers category
        TextView numbersView = (TextView) findViewById(R.id.numbers);
        numbersView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // create a new intent to open the numbers activity
                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);
            }
        });

        // Finds the view that shows the phrases category
        TextView phrasesView = (TextView) findViewById(R.id.phrases);
        phrasesView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // create a new intent to open the phrases activity
                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });

        // Finds the view that shows the family category
        TextView familyView = (TextView) findViewById(R.id.family);
        familyView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // create a new intent to open the family activity
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });

        // Finds the view that shows the colors category
        TextView colorsView = (TextView) findViewById(R.id.colors);
        colorsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // create a new intent to open the colors activity
                Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(intent);
            }
        });
    }
}
