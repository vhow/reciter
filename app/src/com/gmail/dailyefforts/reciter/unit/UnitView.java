package com.gmail.dailyefforts.reciter.unit;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class UnitView extends RelativeLayout {
	// private static final String TAG = UnitView.class.getSimpleName();
	public int id;
	public int start;
	public int end;

	public UnitView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
}
