package com.phuket.tour.video_player;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	static {
		System.loadLibrary("songstudio");
	}
	private Button forward_video_player;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		forward_video_player = (Button) findViewById(R.id.forward_video_player);
		forward_video_player.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, ChangbaPlayerActivity.class);
				startActivity(intent);
			}
		});
	}

}
