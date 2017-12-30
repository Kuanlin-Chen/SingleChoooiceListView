package chen.kuanlin.library;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.ListView;

/**
 * Created by kuanlin on 2017/12/26.
 */

public class SingleChoooiceListView {
    private Activity activity;
    private Context context;
    private String[] textResource;
    private Integer[] imageResource;
    private String title;

    public SingleChoooiceListView(Activity activity, Context context, String[] textResource, Integer[] imageResource){
        this.activity = activity;
        this.context = context;
        this.textResource = textResource;
        this.imageResource = imageResource;
        this.title = "Choose One";
    }

    public SingleChoooiceListView(Activity activity, Context context, String[] textResource, Integer[] imageResource, String title){
        this.activity = activity;
        this.context = context;
        this.textResource = textResource;
        this.imageResource = imageResource;
        this.title = title;
    }

    public void showDialog(){
        //Create an instance of MyAdapter for Listview
        SingleChoooiceAdapter adapter = new SingleChoooiceAdapter(context, R.layout.list_item, textResource, imageResource);

        //Create an instance of ListView for AlertDialog
        View dialogView = activity.getLayoutInflater().inflate(R.layout.dialog_main, null);
        final ListView simpleListView = (ListView)dialogView.findViewById(R.id.simpleListView);
        simpleListView.setAdapter(adapter);

        //Create an instance of AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle(title);
        dialog.setView(dialogView);
        dialog.setPositiveButton("Done", null);
        dialog.show();
    }

    public void showListView(ListView parentListView){
        //Create an instance of MyAdapter for Listview
        SingleChoooiceAdapter adapter = new SingleChoooiceAdapter(context, R.layout.list_item, textResource, imageResource);

        //Set up ListView
        parentListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        parentListView.setAdapter(adapter);
    }
}
