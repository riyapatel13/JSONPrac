package com.example.a10016322.jsonprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject wizards = new JSONObject();
        JSONObject harry = new JSONObject();
        JSONObject ron = new JSONObject();
        JSONArray siblings = new JSONArray();
        JSONObject fred = new JSONObject();
        JSONObject george = new JSONObject();
        JSONObject ginny = new JSONObject();
        JSONObject hermione = new JSONObject();
        JSONObject grades = new JSONObject();

        try{

            harry.put("wand core", "phoenix feather");
            harry.put("name", "Harry");

            ron.put("wand core", "unicorn hair");
            ron.put("name", "Ron");
            ron.put("sibling number", 6);
            fred.put("name", "Fred");
            fred.put("sibling number", 4);
            george.put("name", "George");
            george.put("sibling number", 5);
            ginny.put("name", "Ginny");
            ginny.put("sibling number", 7);
            siblings.put(fred);
            siblings.put(george);
            siblings.put(ginny);
            ron.put("siblings", siblings);

            hermione.put("wand core", "dragon heartstring");
            hermione.put("name", "Hermione");
            grades.put("DADA", 99);
            grades.put("potions", 98);
            grades.put("transfiguration", 100);
            hermione.put("grades", grades);

            wizards.put("harry", harry);
            wizards.put("ron", ron);
            wizards.put("hermione", hermione);

            Log.d("wizards", wizards.toString());
            Log.d("wizards", wizards.getJSONObject("hermione").getJSONObject("grades").get("DADA").toString());
            Log.d("wizards", wizards.getJSONObject("ron").getJSONArray("siblings").getJSONObject(2).get("name").toString());

        }catch(JSONException e){}


    }
}
