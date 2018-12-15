package com.example.mehdi.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button   buttonViewName;
    RecyclerView recyclerView;
    NameListAdapter nameListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonViewName = findViewById(R.id.buttontest);
        buttonViewName.setOnClickListener(this);
        recyclerView = findViewById(R.id.recyclerView);
        nameListAdapter = new NameListAdapter();

        initList();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==1){
            if(resultCode == RESULT_OK && data.getExtras() != null ){
                Bundle args = data.getExtras();
                String name = args.getString("USERNAME");

            }else{

            }
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        nameListAdapter.updateList(DataManager.getInstance().getNameList());

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttontest:
                Intent intent = new Intent(this,FormActivity.class);
                startActivity(intent);

                break;
        }
    }

    private void initList(){
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(nameListAdapter);
    }


}
