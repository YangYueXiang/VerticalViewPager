package com.example.administrator.verticalviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mPager=(ViewPager) findViewById(R.id.viewPager);
        List viewList=getData();
        List tatileData=new ArrayList<String>();
        //创建ViewPager适配器
        MyPagerAdapter adapter=new MyPagerAdapter(viewList,tatileData);
        //      给ViewPager设置适配器
        mPager.setAdapter(adapter);
    }

    /**
     * 获取所有的页卡
     * @return
     */
    private List<View> getData() {
        List<View>list=new ArrayList<View>();
//      加载所有的View内容
        View view1=View.inflate(this, R.layout.view1, null);
        View view2=View.inflate(this, R.layout.view2, null);
        View view3=View.inflate(this, R.layout.view3, null);
        View view4=View.inflate(this, R.layout.view4, null);

//      将所有的内容页View添加到集合中
        list.add(view1);
        list.add(view2);
        list.add(view3);
        list.add(view4);
        return list;
    }
}
