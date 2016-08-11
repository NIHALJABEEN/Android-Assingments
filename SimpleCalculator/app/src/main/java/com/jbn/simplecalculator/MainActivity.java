package com.jbn.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText t2;
    EditText t3;
    Button add,sub, mul, div,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bc,bd,be;

    String str_n1,str_n2;
    double dbl_total=0.0,dbl_rslt=0.0;
    char op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smlpcalc);
        //t1=(EditText)findViewById(R.id.fn);
        //t2=(EditText)findViewById(R.id.sn);
        //t3=(EditText)findViewById(R.id.r);
        t1=(TextView)findViewById(R.id.tv1);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button0);
        bd=(Button)findViewById(R.id.buttondot);
        bc=(Button)findViewById(R.id.buttonc);
        be=(Button)findViewById(R.id.buttoneql);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnone=t1.getText().toString()+b1.getText().toString();
                t1.setText(btnone);



            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btntwo=t1.getText().toString()+b2.getText().toString();
                t1.setText(btntwo);



            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnthr=t1.getText().toString()+b3.getText().toString();
                t1.setText(btnthr);



            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnfor=t1.getText().toString()+b4.getText().toString();
                t1.setText(btnfor);



            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnfiv=t1.getText().toString()+b5.getText().toString();
                t1.setText(btnfiv);



            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnsix=t1.getText().toString()+b6.getText().toString();
                t1.setText(btnsix);



            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnsvn=t1.getText().toString()+b7.getText().toString();
                t1.setText(btnsvn);



            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnegt=t1.getText().toString()+b8.getText().toString();
                t1.setText(btnegt);



            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnnin=t1.getText().toString()+b9.getText().toString();
                t1.setText(btnnin);



            }
        });
        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btnzro=t1.getText().toString()+b0.getText().toString();
                t1.setText(btnzro);



            }
        });
        bd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String btndot=t1.getText().toString()+bd.getText().toString();
                t1.setText(btndot);



            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt= (String) add.getText();
                getOperator(buttontxt);
                //dbl_total=dbl_total+Double.parseDouble(t1.getText().toString());
                //t1.setText("");

                //str_n1 = t1.getText().toString();
               // str_n2 = t2.getText().toString();
               // Float flt = Float.parseFloat(str_n1) + Float.parseFloat(str_n2);
               // t3.setText(flt.toString());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt= (String) sub.getText();
                getOperator(buttontxt);
               // str_n1 = t1.getText().toString();
                //str_n2 = t2.getText().toString();
                //Float flt = Float.parseFloat(str_n1) - Float.parseFloat(str_n2);
                //t3.setText(flt.toString());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt= (String) mul.getText();
                getOperator(buttontxt);
                //str_n1 = t1.getText().toString();
                //str_n2 = t2.getText().toString();
                //Float flt = Float.parseFloat(str_n1) * Float.parseFloat(str_n2);
                //t3.setText(flt.toString());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt= (String) div.getText();
                getOperator(buttontxt);
                //str_n1 = t1.getText().toString();
                //str_n2 = t2.getText().toString();
                //Float flt = Float.parseFloat(str_n1) / Float.parseFloat(str_n2);
                //t3.setText(flt.toString());
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (op)
                {
                    case '+':
                        dbl_rslt = dbl_total + Double.parseDouble(t1.getText().toString());
                        t1.setText(Double.toString(dbl_rslt));
                        dbl_total=0;
                    break;
                    case '-':
                        dbl_rslt = dbl_total - Double.parseDouble(t1.getText().toString());
                        t1.setText(Double.toString(dbl_rslt));
                        dbl_total=0;
                    break;
                    case '*':
                        dbl_rslt = dbl_total * Double.parseDouble(t1.getText().toString());
                        t1.setText(Double.toString(dbl_rslt));
                        dbl_total=0;
                        break;
                    case '/':
                        dbl_rslt = dbl_total / Double.parseDouble(t1.getText().toString());
                        t1.setText(Double.toString(dbl_rslt));
                        dbl_total=0;
                        break;


                }


                //str_n1 = t1.getText().toString();
                //str_n2 = t2.getText().toString();
                //Float flt = Float.parseFloat(str_n1) * Float.parseFloat(str_n2);
               // t3.setText(flt.toString());
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbl_rslt=0;
                t1.setText("");
               // str_n1 = t1.getText().toString();
               // str_n2 = t2.getText().toString();
                //Float flt = Float.parseFloat(str_n1) * Float.parseFloat(str_n2);
                //t3.setText(flt.toString());
            }
        });
    }
    public void getOperator(String btntxt)
    {
        op=btntxt.charAt(0);
        dbl_total=dbl_total+Double.parseDouble(t1.getText().toString());
        t1.setText("");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
