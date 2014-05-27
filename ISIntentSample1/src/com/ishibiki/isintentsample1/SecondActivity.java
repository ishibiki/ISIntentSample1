package com.ishibiki.isintentsample1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondlayout);

		Intent data = getIntent();
		Bundle extras = data.getExtras();

		String disp_pict=extras != null ?extras.getString("SELECTES_PICT"):"";
		ImageView image = (ImageView)findViewById(R.id.fruitimage);

		if(disp_pict.equals("Koala")) {
			image.setImageResource(R.drawable.koala);
		}
		else if(disp_pict.equals("Penguins")) {
			image.setImageResource(R.drawable.penguins);
		}
		else if(disp_pict.equals("Tulips")) {
			image.setImageResource(R.drawable.tulips);
		}

		Button button = (Button)findViewById(R.id.backbutton);
		button.setOnClickListener(new ButtonClickListener());
	}

	class ButtonClickListener implements OnClickListener {

		public void onClick(View v) {
			finish();
		}
	}
}
