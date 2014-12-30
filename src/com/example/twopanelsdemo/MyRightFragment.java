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
		//����LinearLayout����
		LinearLayout linear = new LinearLayout(getActivity());
		//��ȡϵͳLayoutInflater���������
		LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		//��myright_fragment��䵽������LinearLayout�ļ���
		layoutInflater.inflate(R.layout.myright_fragment, linear, true);
		//��ȡ���������е�view�еĲ��ֿؼ�
		LinearLayout linearInParent = (LinearLayout) mContainer.findViewById(R.id.linearRight);
		//��������LinearLayout��Ϊ��view��ӵ��������е�view��
		linearInParent.addView(linear);
		return this.mContainer;
	}
}
