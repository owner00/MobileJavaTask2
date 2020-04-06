package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        String[] myLikes = {"Family", "The Word", "Software Dev", "Personal Dev"};
        String[] myDislikes = {"Noise", "Stupid Talk", "Arrogance", "Lack of Direction"};
        String[] myHobbies = {"Studying", "Listening to Music", "Software Dev", "Writing"};

        ArrayAdapter<String> likesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myLikes);
        ArrayAdapter<String> dislikesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myDislikes);
        ArrayAdapter<String> hobbiesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myHobbies);

        ListView listViewOne = (ListView)findViewById(R.id.listView1);
        ListView listViewTwo = (ListView)findViewById(R.id.listView2);
        ListView listViewThree = (ListView)findViewById(R.id.listView3);

        listViewOne.setAdapter(likesAdapter);
        listViewTwo.setAdapter(dislikesAdapter);
        listViewThree.setAdapter(hobbiesAdapter);
    }


}
