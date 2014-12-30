package com.example.twopanelsdemo;

import com.desarrollodroide.twopanels.RightFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MyRightFragment extends RightFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		//创建LinearLayout布局
		LinearLayout linear = new LinearLayout(getActivity());
		//获取系统LayoutInflater布局填充器
		LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		//将myright_fragment填充到创建的LinearLayout文件中
		layoutInflater.inflate(R.layout.myright_fragment, linear, true);
		//获取依赖包当中的view中的布局控件
		LinearLayout linearInParent = (LinearLayout) mContainer.findViewById(R.id.linearRight);
		//将创建的LinearLayout作为子view添加到依赖包中的view中
		linearInParent.addView(linear);
		return this.mContainer;
	}
}
