package au.com.twomatesmedia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import au.com.twomatesmedia.myapplication.dummy.DummyContent;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends AppCompatActivity implements  ItemFragment.OnListFragmentInteractionListener {

    @Inject
    Book book;

    @Inject
    Book book1;

    @Inject
    ItemFragment itemFragment1;

    @Inject
    ItemFragment itemFragment2;

    @Inject
    Bar bar;

    private String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setInjection();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        ((TextView)findViewById(R.id.textInfo)).setText(book.toString() +
                "\n" + getComponent().getBook().toString() +
                "\n" + getComponent().getLazySomeType().get() +
                "\n" + getComponent().getLazySomeType().get() +
                "\n" + getComponent().getSomeTypeProvider().get() +
                "\n" + book1.toString());

        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_container,
                itemFragment1).commit();

        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_container_1,
                ItemFragment.newInstance(2)).commit();
    }

    public MyComponent getComponent()
    {
        return ((MyApplication)getApplication()).getMyComponent();

    }

    public void setInjection()
    {
        getComponent().inject(this);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
