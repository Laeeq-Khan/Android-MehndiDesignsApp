package com.MehndiDesigns2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DesignsActivity extends AppCompatActivity {

    List<ImageModel> imageModelList = new ArrayList<>();
    RecyclerView.Adapter adapter;
    RecyclerView recyclerView;
    int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        status = intent.getIntExtra("status" ,0);
        System.out.println("This is status we recirved from action "+status);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        this.recyclerView.setLayoutManager(manager);

        if(status ==2){
            imageModelList.add(new ImageModel(R.drawable.arms3));
            imageModelList.add(new ImageModel(R.drawable.arms2));
            imageModelList.add(new ImageModel(R.drawable.arms8));
            imageModelList.add(new ImageModel(R.drawable.arms4));
            imageModelList.add(new ImageModel(R.drawable.arms5));
            imageModelList.add(new ImageModel(R.drawable.arms7));
            imageModelList.add(new ImageModel(R.drawable.arms9));
            imageModelList.add(new ImageModel(R.drawable.arms10));
            imageModelList.add(new ImageModel(R.drawable.arms11));
            imageModelList.add(new ImageModel(R.drawable.arms12));
            imageModelList.add(new ImageModel(R.drawable.arms13));
            imageModelList.add(new ImageModel(R.drawable.arms14));
            imageModelList.add(new ImageModel(R.drawable.arms15));
            imageModelList.add(new ImageModel(R.drawable.arms16));
            imageModelList.add(new ImageModel(R.drawable.arms17));
            imageModelList.add(new ImageModel(R.drawable.arms18));
            imageModelList.add(new ImageModel(R.drawable.arms19));
            imageModelList.add(new ImageModel(R.drawable.arms20));
            imageModelList.add(new ImageModel(R.drawable.arms1));
            imageModelList.add(new ImageModel(R.drawable.arms21));
            imageModelList.add(new ImageModel(R.drawable.arms22));
            imageModelList.add(new ImageModel(R.drawable.arms23));
            imageModelList.add(new ImageModel(R.drawable.arms24));
            imageModelList.add(new ImageModel(R.drawable.arms25));
            imageModelList.add(new ImageModel(R.drawable.arms26));
            imageModelList.add(new ImageModel(R.drawable.arms27));
            imageModelList.add(new ImageModel(R.drawable.arms28));
            imageModelList.add(new ImageModel(R.drawable.arms29));
            imageModelList.add(new ImageModel(R.drawable.arms30));
            imageModelList.add(new ImageModel(R.drawable.arms31));
            imageModelList.add(new ImageModel(R.drawable.arms32));
            imageModelList.add(new ImageModel(R.drawable.arms33));
            imageModelList.add(new ImageModel(R.drawable.arms34));
            imageModelList.add(new ImageModel(R.drawable.arms35));
            imageModelList.add(new ImageModel(R.drawable.arms36));
            imageModelList.add(new ImageModel(R.drawable.arms37));
            imageModelList.add(new ImageModel(R.drawable.arms38));
            imageModelList.add(new ImageModel(R.drawable.arms6));
        }else if(status==3){
            imageModelList.add(new ImageModel(R.drawable.feets24));
            imageModelList.add(new ImageModel(R.drawable.feets25));
            imageModelList.add(new ImageModel(R.drawable.feets17));
            imageModelList.add(new ImageModel(R.drawable.feets6));
            imageModelList.add(new ImageModel(R.drawable.feets11));
            imageModelList.add(new ImageModel(R.drawable.feets2));
            imageModelList.add(new ImageModel(R.drawable.feets9));
            imageModelList.add(new ImageModel(R.drawable.feets3));
            imageModelList.add(new ImageModel(R.drawable.feets4));
            imageModelList.add(new ImageModel(R.drawable.feets5));
            imageModelList.add(new ImageModel(R.drawable.feets7));
            imageModelList.add(new ImageModel(R.drawable.feets8));
            imageModelList.add(new ImageModel(R.drawable.feets10));
            imageModelList.add(new ImageModel(R.drawable.feets12));
            imageModelList.add(new ImageModel(R.drawable.feets13));
            imageModelList.add(new ImageModel(R.drawable.feets14));
            imageModelList.add(new ImageModel(R.drawable.feets15));
            imageModelList.add(new ImageModel(R.drawable.feets16));
            imageModelList.add(new ImageModel(R.drawable.feets18));
            imageModelList.add(new ImageModel(R.drawable.feets19));
            imageModelList.add(new ImageModel(R.drawable.feets20));
            imageModelList.add(new ImageModel(R.drawable.feets21));
            imageModelList.add(new ImageModel(R.drawable.feets22));
            imageModelList.add(new ImageModel(R.drawable.feets23));

            imageModelList.add(new ImageModel(R.drawable.feets26));
            imageModelList.add(new ImageModel(R.drawable.feets27));
            imageModelList.add(new ImageModel(R.drawable.feets1));
            imageModelList.add(new ImageModel(R.drawable.feets28));
            imageModelList.add(new ImageModel(R.drawable.feets30));

        }else{
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns12));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns25));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns29));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns5));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns2));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns3));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns4));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns6));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns1));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns7));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns8));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns9));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns10));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns11));

            imageModelList.add(new ImageModel(R.drawable.mehndidesigns13));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns14));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns15));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns16));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns17));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns18));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns19));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns20));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns21));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns22));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns23));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns24));

            imageModelList.add(new ImageModel(R.drawable.mehndidesigns26));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns27));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns28));

            imageModelList.add(new ImageModel(R.drawable.mehndidesigns30));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns31));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns32));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns33));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns34));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns35));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns36));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns37));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns38));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns39));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns40));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns41));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns42));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns43));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns44));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns45));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns46));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns47));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns48));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns49));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns50));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns51));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns52));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns53));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns54));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns55));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns56));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns57));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns58));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns59));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns60));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns61));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns62));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns63));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns64));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns65));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns66));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns67));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns68));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns69));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns70));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns71));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns72));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns73));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns74));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns75));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns76));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns77));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns78));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns79));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns80));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns81));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns82));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns83));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns84));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns85));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns86));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns87));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns88));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns89));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns90));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns91));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns92));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns93));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns94));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns95));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns96));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns97));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns98));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns99));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns100));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns101));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns102));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns103));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns104));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns105));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns106));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns107));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns108));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns109));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns110));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns111));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns112));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns113));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns114));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns115));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns116));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns117));
            imageModelList.add(new ImageModel(R.drawable.mehndidesigns118));

        }


        adapter = new ImageAdapter(imageModelList);
        recyclerView.setAdapter(adapter);
    }

}


