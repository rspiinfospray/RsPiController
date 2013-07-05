package org.infospray.rspicontroller.listener;

import org.infospray.rspicontroller.activity.ControllerActivity;
import org.infospray.rspicontroller.ui.UpdaterUI;
import android.view.View;
import android.view.View.OnClickListener;

public class StopListener implements OnClickListener {

	
	private ControllerActivity activity;
	

	public StopListener(ControllerActivity activity) {
		this.activity = activity;
	}


	@Override
	public void onClick(View v) {
		 UpdaterUI.stop(activity);		
	}

}
