package lk.ac.kln.pizzanew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void confirm(View view) {
        Intent intent = new Intent(OrderActivity.this,PizzaListActivity.class);
        startActivity(intent);
        Toast.makeText(this,"Oreder is confirmed",Toast.LENGTH_LONG).show();
    }
}
