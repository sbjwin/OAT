package kch.oat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;

public class OatActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oat_activity);
		
		// TabHost 생성
		TabHost tHost=(TabHost)this.findViewById(R.id.tabhost);
		tHost.setup();

		TabHost.TabSpec tSpec=tHost.newTabSpec("tab1");
		tSpec.setIndicator("과학");
		tSpec.setContent(new Intent(OatActivity.this,SubjectContentView.class));
		tHost.addTab(tSpec);
		
		// TabSpec 생성
		tSpec=tHost.newTabSpec("tab2");
		//tSpec.setContent(R.id.tab2);
		tSpec.setIndicator("수학");
		tHost.addTab(tSpec);
		tHost.setCurrentTab(0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.oat, menu);
		return true;
	}
}
