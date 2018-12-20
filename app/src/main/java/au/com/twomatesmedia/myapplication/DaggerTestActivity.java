package au.com.twomatesmedia.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import au.com.twomatesmedia.myapplication.dummy.DummyContent;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class DaggerTestActivity extends AppCompatActivity implements DaggerItemFragment.OnListFragmentInteractionListener {


    @Inject
   Book book;
    private String TAG = DaggerTestActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();
                Intent intent = new Intent(getBaseContext(),DaggerTestSecondActivity.class);
                startActivity(intent);


            }
        });

       Log.d(TAG, "onCreate: " + book);

       getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_container_dagger,DaggerItemFragment.newInstance(1)).commit();


    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
