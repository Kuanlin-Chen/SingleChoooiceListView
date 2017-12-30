# SingleChoooiceListView

**How to add dependency**

Add remote maven url in project/build.gradle

```
allprojects {
    repositories {
		maven { url "https://jitpack.io" }
	}
}
```

Then add a library dependency in app/build.gradle

```
dependencies {
    compile 'com.github.Kuanlin-Chen:SingleChoooiceListView:2.0'
}
```

**Usage**

```
private String[] textResource = new String[]{"A","B","C"};
private Integer[] imageResource = new Integer[]{R.drawable.a,R.drawable.b,R.drawable.c};
private int defaultItem = 0;
```

Show in Dialog

![Alt text](https://github.com/Kuanlin-Chen/SingleChoooiceListView/blob/master/library/src/main/res/drawable/showindialog.png?raw=true "Show in Dialog")

```
Button button_main = (Button)findViewById(R.id.button_main);
button_main.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        SingleChoooiceListView singleChoooiceListView = new SingleChoooiceListView(MainActivity.this, MainActivity.this, textResource, imageResource, defaultItem);
        singleChoooiceListView.showDialog();
    }
});;
```

Show in ListView

![Alt text](https://github.com/Kuanlin-Chen/SingleChoooiceListView/blob/master/library/src/main/res/drawable/showinlistview.png?raw=true "Show in ListView")


```
ListView listView = (ListView)findViewById(R.id.listview_main);
SingleChoooiceListView singleChoooiceListView = new SingleChoooiceListView(MainActivity.this, MainActivity.this, textResource, imageResource, defaultItem);
singleChoooiceListView.showListView(listView);
```
