package com.example.administrator.verticalviewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MyPagerAdapter extends PagerAdapter{
    private List<View> viewList;
    private List<String> titleData;
    public MyPagerAdapter(List<View> viewList, List<String> tatileData) {
        this.viewList = viewList;
        this.titleData=tatileData;
    }
    // 获取页面的个数
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return viewList.size();
    }
    // view和对象是否相等
    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }
    // 实例化页面时调用
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = viewList.get(position);
        TextView tv_title=view.findViewById(R.id.tv_title);
        tv_title.setText("当前的位置是第"+position+"页");
        container.addView(view);
        return viewList.get(position);
    }
    // 销毁页面时调用
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(viewList.get(position));
    }
}
