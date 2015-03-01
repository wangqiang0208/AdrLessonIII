package com.example.qiangwang.adrlessoniii;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.qiangwang.adrlessoniii.layout.CustomAdapter;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listValue1 = {"One", "Two", "Three"};
        final ListView listView1 = (ListView) findViewById(R.id.list_view_1);
        ListAdapter listAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listValue1);
        listView1.setAdapter(listAdapter1);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String res = "You selected " +
                        String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
            }
        });

        String[] listValue2 = {"红色", "绿色", "蓝色"};
        ListView listView2 = (ListView) findViewById(R.id.list_view_2);
        ListAdapter listAdapter2 = new ArrayAdapter<String>(this, R.layout.list_view, R.id.list_view_item_1, listValue2);
        listView2.setAdapter(listAdapter2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String res = "你选择的颜色： " +
                        String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
            }
        });

        String[] listValue3 = {"中国", "日本", "韩国"};
        ListView listView3 = (ListView) findViewById(R.id.list_view_3);
        ListAdapter listAdapter3 = new CustomAdapter(this, listValue3);
        listView3.setAdapter(listAdapter3);
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String res = "你选择的国家：" +
                        String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
            }
        });
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
