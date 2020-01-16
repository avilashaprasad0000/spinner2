package com.example.spinner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.*;



public class MainActivity extends AppCompatActivity {
    Spinner sp1,sp2,sp3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=findViewById(R.id.sp1);
        sp2=findViewById(R.id.sp2);
        sp3=findViewById(R.id.sp3);
        b1=findViewById(R.id.b1);

        final String cou[]={"India","South Africa","New Zealand"};
        final String India[]={"West Bengal","Maharashtra","Bihar"};
        final String WB[]={"Asansol","Durgapur","Kolkata"};
        final String Mah[]={"Pune","Mumbai","Nagpur"};
        final String Bih[]={"Patna","Muzaf","Motihari"};
        final String South_Africa[]={"Southern","Eastern","Western"};
        final String south[]={"Cape Town","Durban","Johannesburg"};
        final String east[]={"Mthatha","Queenstown","Grahamstown"};
        final String west[]={"Paarl","George","Ashton"};
        final String New_Zeal[]={"Auckland","Tasman","Nelson"};
        final String Auck[]={"Drury","Clarks","Orewa"};
        final String Tas[]={"Hobart","Burnie","Devonport"};
        final String Nel[]={"Mapua","Motueka","Marahau"};

        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cou);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(aa);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemselect= cou[position];
                //Toast.makeText(MainActivity.this,"Country = "+itemselect ,Toast.LENGTH_SHORT).show();
                if(position==0)
                {
                    ArrayAdapter<String> ada1 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,India);
                    sp2.setAdapter(ada1);
                    sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            String state= India[position];
                                if(position==0)
                                {
                                    ArrayAdapter<String> adaa1 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,WB);
                                    sp3.setAdapter(adaa1);
                                }
                                else if(position==1)
                                {
                                    ArrayAdapter<String> adaa2 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,Mah);
                                    sp3.setAdapter(adaa2);
                                }
                                else
                                {
                                    ArrayAdapter<String> adaa3 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,Bih);
                                    sp3.setAdapter(adaa3);
                                }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                else if(position==1)
                {
                    ArrayAdapter<String> ada2 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,South_Africa);
                    sp2.setAdapter(ada2);
                    sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            String state= South_Africa[position];
                            if(position==0)
                            {
                                ArrayAdapter<String> adaa1 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,south);
                                sp3.setAdapter(adaa1);
                            }
                            else if(position==1)
                            {
                                ArrayAdapter<String> adaa2 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,east);
                                sp3.setAdapter(adaa2);
                            }
                            else
                            {
                                ArrayAdapter<String> adaa3 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,west);
                                sp3.setAdapter(adaa3);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
                else
                {
                    ArrayAdapter<String> ada3 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,New_Zeal);
                    sp2.setAdapter(ada3);
                    sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String state= New_Zeal[position];
                            if(position==0)
                            {
                                ArrayAdapter<String> adaa1 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,Auck);
                                sp3.setAdapter(adaa1);
                            }
                            else if(position==1)
                            {
                                ArrayAdapter<String> adaa2 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,Tas);
                                sp3.setAdapter(adaa2);
                            }
                            else
                            {
                                ArrayAdapter<String> adaa3 =new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_item,Nel);
                                sp3.setAdapter(adaa3);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String C,CC,S;
            C= sp1.getSelectedItem().toString();
            CC= sp3.getSelectedItem().toString();
            S= sp2.getSelectedItem().toString();
            Toast.makeText(MainActivity.this,"Country = "+C+"\nState = "+S+"\nCity = "+CC,Toast.LENGTH_SHORT).show();
        }
    });


    }
}

