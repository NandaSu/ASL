package com.example.asl_project;

import static android.content.ContentValues.TAG;

import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.asl_project.Model.AslModel;
import com.example.asl_project.data.ASLHandler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ASLHandler db = new ASLHandler(MainActivity.this);
    ArrayList<AslModel> aslModelArrayList = new ArrayList<>();;
    ASL_RecyclerView_Adapter recyclerViewAdapter;
    SearchView searchView;
    ImageView home;


    int[] resourceID = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
            R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,
            R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p,
            R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t,
            R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x,
            R.drawable.y, R.drawable.z, R.drawable.one, R.drawable.two,
            R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six,
            R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.zero
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.home_icon);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager= new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                Searching2(query);
//                getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
//                Searching(newText);
                return true;
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


       /* aslModelArrayList.add(new AslModel(resourceID[0],"A"));
        aslModelArrayList.add(new AslModel(resourceID[1],"B"));
        aslModelArrayList.add(new AslModel(resourceID[2],"C"));
        aslModelArrayList.add(new AslModel(resourceID[3],"D"));*/

        AslModel A = new AslModel(1,resourceID[0],"A");
        AslModel B = new AslModel(2,resourceID[1],"B");
        AslModel C = new AslModel(3,resourceID[2],"C");
        AslModel D = new AslModel(4,resourceID[3],"D");
        AslModel E = new AslModel(5,resourceID[4],"E");
        AslModel F = new AslModel(6 ,resourceID[5],"F");
        AslModel G = new AslModel(7 ,resourceID[6],"G");
        AslModel H = new AslModel(8 ,resourceID[7],"H");
        AslModel I = new AslModel(9 ,resourceID[8],"I");
        AslModel J = new AslModel(10,resourceID[9],"J");
        AslModel K = new AslModel(11,resourceID[10],"K");
        AslModel L = new AslModel(12,resourceID[11],"L");
        AslModel M = new AslModel(13,resourceID[12],"M");
        AslModel N = new AslModel(14,resourceID[13],"M");
        AslModel O = new AslModel(15,resourceID[14],"O");
        AslModel P = new AslModel(16,resourceID[15],"P");
        AslModel Q = new AslModel(17,resourceID[16],"Q");
        AslModel R = new AslModel(18,resourceID[17],"R");
        AslModel S = new AslModel(19,resourceID[18],"S");
        AslModel T = new AslModel(20,resourceID[19],"T");
        AslModel U = new AslModel(21,resourceID[20],"U");
        AslModel V = new AslModel(22,resourceID[21],"U");
        AslModel W = new AslModel(23,resourceID[22],"W");
        AslModel X = new AslModel(24,resourceID[23],"X");
        AslModel Y = new AslModel(25,resourceID[24],"Y");
        AslModel Z = new AslModel(26,resourceID[25],"Z");

        AslModel one = new AslModel(27,resourceID[26],"1");
        AslModel two = new AslModel(28,resourceID[27],"2");
        AslModel three =new AslModel(29,resourceID[28],"3");
        AslModel four  = new AslModel(30,resourceID[29],"4");
        AslModel five = new AslModel(31,resourceID[30],"5");
        AslModel six = new AslModel(32,resourceID[31],"6");
        AslModel seven = new AslModel(33,resourceID[32],"7");
        AslModel eight = new AslModel(34,resourceID[33],"8");
        AslModel nine  = new AslModel(35,resourceID[34],"9");
        AslModel zero = new AslModel(36,resourceID[35],"0");



        db.addASL(A);
        db.addASL(B);
        db.addASL(C);
        db.addASL(D);
        db.addASL(E);
        db.addASL(F);
        db.addASL(G);
        db.addASL(H);
        db.addASL(I);
        db.addASL(J);
        db.addASL(K);
        db.addASL(L);
        db.addASL(M);
        db.addASL(N);
        db.addASL(O);
        db.addASL(P);
        db.addASL(Q);
        db.addASL(R);
        db.addASL(S);
        db.addASL(T);
        db.addASL(U);
        db.addASL(V);
        db.addASL(W);
        db.addASL(X);
        db.addASL(Y);
        db.addASL(Z);

        db.addASL(zero);
        db.addASL(one);
        db.addASL(two);
        db.addASL(three);
        db.addASL(four);
        db.addASL(five);
        db.addASL(six);
        db.addASL(seven);
        db.addASL(eight);
        db.addASL(nine);


        /*db.deleteASLRecord(zero);
        db.deleteASLRecord(one);
        db.deleteASLRecord(two);
        db.deleteASLRecord(three);
        db.deleteASLRecord(four);
        db.deleteASLRecord(five);
        db.deleteASLRecord(six);
        db.deleteASLRecord(seven);
        db.deleteASLRecord(eight);
        db.deleteASLRecord(nine);*/

        List<AslModel> aslModelList = db.getAllAslMap();
        aslModelArrayList.addAll(aslModelList);

        for(AslModel i:aslModelArrayList)
            Log.d("TAG", "onCreate: "+i.getId()+" id "+i.getAslAlphabet()+" alpha ");

        recyclerViewAdapter = new ASL_RecyclerView_Adapter(MainActivity.this,aslModelArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);


    }//On create ENDS


    public void Searching(String text){
        ArrayList<AslModel> aslModelList = new ArrayList<>();
        for(AslModel i:aslModelArrayList){
                if(i.getAslAlphabet().toLowerCase().contains(text.toLowerCase())){
                    aslModelList.add(i);
                }
                if(aslModelArrayList.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please Enter",Toast.LENGTH_SHORT).show();
                }
                else
                    recyclerViewAdapter.setFilteredList(aslModelList);
            }

    }
    public void Searching2(String query){
        ArrayList<AslModel> aslModelList = new ArrayList<>();
        for(int j =0;j<query.length();j++) {
            char letter = Character.toLowerCase(query.charAt(j));
            char aslLetter;
            for (AslModel i : aslModelArrayList) {
                aslLetter = Character.toLowerCase(i.getAslAlphabet().charAt(0));
                if (aslLetter == letter) {
                    aslModelList.add(i);
                }

                if (aslModelArrayList.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter", Toast.LENGTH_SHORT).show();
                } else
                    recyclerViewAdapter.setFilteredList(aslModelList);
            }
        }
    }

}

/*        aslModelArrayList.add(new AslModel(1,resourceID[0],"A"));
        aslModelArrayList.add(new AslModel(2,resourceID[1],"B"));
        aslModelArrayList.add(new AslModel(3,resourceID[2],"C"));
        aslModelArrayList.add(new AslModel(4,resourceID[3],"D"));
        aslModelArrayList.add(new AslModel(5,resourceID[4],"E"));
        aslModelArrayList.add(new AslModel(6 ,resourceID[5],"F"));
        aslModelArrayList.add(new AslModel(7 ,resourceID[6],"G"));
        aslModelArrayList.add(new AslModel(8 ,resourceID[7],"H"));
        aslModelArrayList.add(new AslModel(9 ,resourceID[8],"I"));
        aslModelArrayList.add(new AslModel(10,resourceID[9],"J"));
        aslModelArrayList.add(new AslModel(11,resourceID[10],"K"));
        aslModelArrayList.add(new AslModel(12,resourceID[11],"L"));
        aslModelArrayList.add(new AslModel(13,resourceID[12],"M"));
        aslModelArrayList.add(new AslModel(14,resourceID[13],"M"));
        aslModelArrayList.add(new AslModel(15,resourceID[14],"O"));
        aslModelArrayList.add(new AslModel(16,resourceID[15],"P"));
        aslModelArrayList.add(new AslModel(17,resourceID[16],"Q"));
        aslModelArrayList.add(new AslModel(18,resourceID[17],"R"));
        aslModelArrayList.add(new AslModel(19,resourceID[18],"S"));
        aslModelArrayList.add(new AslModel(20,resourceID[19],"T"));
        aslModelArrayList.add(new AslModel(21,resourceID[20],"U"));
        aslModelArrayList.add(new AslModel(22,resourceID[21],"U"));
        aslModelArrayList.add(new AslModel(23,resourceID[22],"W"));
        aslModelArrayList.add(new AslModel(24,resourceID[23],"X"));
        aslModelArrayList.add(new AslModel(25,resourceID[24],"Y"));
        aslModelArrayList.add(new AslModel(26,resourceID[25],"Z"));*/