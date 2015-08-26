package book.learning.my.custome_list_view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    String color_names[] = {"red", "green", "blue", "yellow", "pink", "brown"};
    Integer image_id[] = {R.drawable.red, R.drawable.green, R.drawable.blue, R.drawable.yellow, R.drawable.pink, R.drawable.brown};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Customelistadapter adapter = new Customelistadapter(this, image_id, color_names);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);

    }



}