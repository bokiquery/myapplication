package blue.boki.com.myapplication;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.net.URI;


public class MainActivity2Activity extends ActionBarActivity {


    //private URI url = "http://img1.36706.com/lipic/allimg/20140222/1393004014N0-45T37.jpg";

    private URI url = URI.create("http://img1.36706.com/lipic/allimg/20140222/1393004014N0-45T37.jpg");


    private ImageView mIconImageView;

   // private Button mButton;

    private ProgressBar mProgressBar;

    private ImageView mImageView;



//    private Button m
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        mIconImageView = (ImageView)findViewById(R.id.img);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
