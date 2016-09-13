package cn.ben.googleplayapiguideadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "BEN";
    // Create a message handling object as an anonymous class.
    private final AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            // Do something in response to the click
            Log.d(TAG, "parent: " + parent + " v: " + v + " position: " + position + " id: " + id);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ArrayAdapter
        Object[] myStringArray = {new Book("哈利波特"), new Book("童年"), "不", "才", "啊", "不", "才", "啊", "不", "才", "啊", "不", "才", "啊", "不", "才", "啊", "不", "才", "啊", "不", "才"};
        ArrayAdapter<Object> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, myStringArray);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(mMessageClickedHandler);

        // TODO: 2016/8/11 SimpleCursorAdapter
//        String[] fromColumns = {ContactsContract.Data.DISPLAY_NAME,
//                ContactsContract.CommonDataKinds.Phone.NUMBER};
//        int[] toViews = {R.id.display_name, R.id.phone_number};
//        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
//                R.layout.person_name_and_number, cursor, fromColumns, toViews, 0);
//        ListView listView = getListView();
//        listView.setAdapter(adapter);
    }

    @SuppressWarnings("unused")
    private ListView getListView() {
        return (ListView) findViewById(R.id.listview);
    }
}
