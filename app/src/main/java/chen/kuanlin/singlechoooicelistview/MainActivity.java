package chen.kuanlin.singlechoooicelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] textResource = new String[]{"Red","Green","Yellow","Red","Green","Yellow","Red"};
    private Integer[] imageResource = new Integer[]{R.drawable.red, R.drawable.green, R.drawable.yellow,
            R.drawable.red, R.drawable.green, R.drawable.yellow,R.drawable.red};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listview_main);
        SingleChoooiceListView singleChoooiceListView = new SingleChoooiceListView(MainActivity.this, MainActivity.this, textResource, imageResource);
        singleChoooiceListView.showListView(listView);

        /*
        Button button_main = (Button)findViewById(R.id.button_main);
        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SingleChoooiceListView singleChoooiceListView = new SingleChoooiceListView(MainActivity.this, MainActivity.this, textResource, imageResource);
                singleChoooiceListView.showDialog();
            }
        });*/
    }
}
