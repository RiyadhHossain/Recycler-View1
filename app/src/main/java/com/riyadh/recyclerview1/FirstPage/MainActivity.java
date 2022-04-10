package com.riyadh.recyclerview1.FirstPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.riyadh.recyclerview1.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List <String> nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText= new ArrayList<>();
        recyclerView=findViewById(R.id.recycler);

        nameText.add("Riyadh Hossain0");
        nameText.add("Riyadh Hossain1");
        nameText.add("Riyadh Hossain2");
        nameText.add("Riyadh Hossain3");
        nameText.add("Riyadh Hossain4");
        nameText.add("Riyadh Hossain5");
        nameText.add("Riyadh Hossain6");
        nameText.add("Riyadh Hossain7");
        nameText.add("Riyadh Hossain8");
        nameText.add("Riyadh Hossain9");
        nameText.add("Riyadh Hossain10");
        nameText.add("Riyadh Hossain11");
        nameText.add("Riyadh Hossain12");
        nameText.add("Riyadh Hossain13");
        nameText.add("Riyadh Hossain14");
        nameText.add("Riyadh Hossain15");
        nameText.add("Riyadh Hossain16");
        nameText.add("Riyadh Hossain17");
        nameText.add("Riyadh Hossain18");
        nameText.add("Riyadh Hossain19");
        nameText.add("Riyadh Hossain20");
        nameText.add("Riyadh Hossain21");
        nameText.add("Riyadh Hossain \n Riyadh Hossain Riyadh Hossain \n Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain Riyadh Hossain ");
        nameText.add("Riyadh Hossain0");
        nameText.add("Riyadh Hossain1");
        nameText.add("Riyadh Hossain2");
        nameText.add("Riyadh Hossain3");
        nameText.add("Riyadh Hossain4");
        nameText.add("Riyadh Hossain5");
        nameText.add("Riyadh Hossain6");
        nameText.add("Riyadh Hossain7");
        nameText.add("Riyadh Hossain8");
        nameText.add("Riyadh Hossain9");
        nameText.add("Riyadh Hossain10");
        nameText.add("Riyadh Hossain11");
        nameText.add("Riyadh Hossain12");
        nameText.add("Riyadh Hossain13");
        nameText.add("Riyadh Hossain14");
        nameText.add("Riyadh Hossain15");
        nameText.add("Riyadh Hossain16");
        nameText.add("Riyadh Hossain17");
        nameText.add("Riyadh Hossain18");
        nameText.add("Riyadh Hossain19");
        nameText.add("Riyadh Hossain20");
        nameText.add("Riyadh Hossain21");
        nameText.add("Riyadh Hossain22");
        nameText.add("Riyadh Hossain0");
        nameText.add("Riyadh Hossain1");
        nameText.add("Riyadh Hossain2");
        nameText.add("Riyadh Hossain3");
        nameText.add("Riyadh Hossain4");
        nameText.add("Riyadh Hossain5");
        nameText.add("Riyadh Hossain6");
        nameText.add("Riyadh Hossain7");
        nameText.add("Riyadh Hossain8");
        nameText.add("Riyadh Hossain9");
        nameText.add("Riyadh Hossain10");
        nameText.add("Riyadh Hossain11");
        nameText.add("Riyadh Hossain12");
        nameText.add("Riyadh Hossain13");
        nameText.add("Riyadh Hossain14");
        nameText.add("Riyadh Hossain15");
        nameText.add("Riyadh Hossain16");
        nameText.add("Riyadh Hossain17");
        nameText.add("Riyadh Hossain18");
        nameText.add("Riyadh Hossain19");
        nameText.add("Riyadh Hossain20");
        nameText.add("Riyadh Hossain21");
        nameText.add("Riyadh Hossain22");

        NameAdapter nameAdapter= new NameAdapter(this,nameText);
        recyclerView.setAdapter(nameAdapter);

    }
}