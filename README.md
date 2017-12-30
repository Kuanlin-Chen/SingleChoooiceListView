# SingleChoooiceListView

**How to add dependency**

Add remote maven url in project/build.gradle

```allprojects {
    repositories {
		maven { url "https://jitpack.io" }
	}
}```

Then add a library dependency in app/build.gradle

```dependencies {
    compile 'com.github.Kuanlin-Chen:SingleChoooiceListView:1.0'
}```

**Usage**

```private String[] textResource = new String[]{"A","B","C"};
private Integer[] imageResource = new Integer[]{R.drawable.red,R.drawable.green,R.drawable.yellow};```

Show in Dialog

```Button button_main = (Button)findViewById(R.id.button_main);
button_main.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        SingleChoooiceListView singleChoooiceListView = new SingleChoooiceListView(MainActivity.this, MainActivity.this, textResource, imageResource);
        singleChoooiceListView.showDialog();
    }
});;```

Show in ListView

```ListView listView = (ListView)findViewById(R.id.listview_main);
SingleChoooiceListView singleChoooiceListView = new SingleChoooiceListView(MainActivity.this, MainActivity.this, textResource, imageResource);
singleChoooiceListView.showListView(listView);```
