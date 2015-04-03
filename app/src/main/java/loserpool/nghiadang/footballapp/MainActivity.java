package loserpool.nghiadang.footballapp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import static loserpool.nghiadang.footballapp.R.id.*;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    private Toolbar toolbar;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView);

        ItemData itemData[] = {new ItemData("Arizona C.", R.drawable.bronco_image),
                new ItemData("Atlanta F.", R.drawable.bronco_image),
                new ItemData("Baltimore R.", R.drawable.bronco_image),
                new ItemData("Buffalo B.", R.drawable.bronco_image),
                new ItemData("Carolina P.", R.drawable.bronco_image),
                new ItemData("Chicago B.", R.drawable.bronco_image),
                new ItemData("Cincinnati B.", R.drawable.bronco_image),
                new ItemData("Cleveland B.", R.drawable.bronco_image),
                new ItemData("Denver B.", R.drawable.bronco_image),
                new ItemData("Dallas C.", R.drawable.bronco_image),
                new ItemData("Detroit L.", R.drawable.bronco_image),
                new ItemData("Indianapolis C.", R.drawable.bronco_image),
                new ItemData("Green Bay P.", R.drawable.bronco_image),
                new ItemData("Jacksonville J.", R.drawable.bronco_image),
                new ItemData("Minnesota V.", R.drawable.bronco_image),
                new ItemData("Kansas City C.", R.drawable.bronco_image),
                new ItemData("New Orleans S.", R.drawable.bronco_image),
                new ItemData("Miami D.", R.drawable.bronco_image),
                new ItemData("New York G.", R.drawable.bronco_image),
                new ItemData("New England P.", R.drawable.bronco_image),
                new ItemData("Philadelphia E.", R.drawable.bronco_image),
                new ItemData("New York J.", R.drawable.bronco_image),
                new ItemData("Saint Louis R.", R.drawable.bronco_image),
                new ItemData("Oakland R.", R.drawable.bronco_image),
                new ItemData("San Francisco F.", R.drawable.bronco_image),
                new ItemData("Pittsburgh S.", R.drawable.bronco_image),
                new ItemData("Seattle S.", R.drawable.bronco_image),
                new ItemData("San Diego C.", R.drawable.bronco_image),
                new ItemData("Tampa Bay B.", R.drawable.bronco_image),
                new ItemData("Tennessee T.", R.drawable.bronco_image),
                new ItemData("Washington R.", R.drawable.bronco_image),};


        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        MyListAdapter myListAdapter = new MyListAdapter(itemData);
        recyclerView1.setAdapter(myListAdapter);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout)findViewById(R.id.drawer_layout), toolbar);


        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.weeks, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


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
        if (id == action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        // Toast.makeText(this, "You Selected " + myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private void selectItem(int position) {

    }
}

