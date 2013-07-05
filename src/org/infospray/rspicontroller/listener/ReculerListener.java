package org.infospray.rspicontroller.listener;

import org.infospray.rspicontroller.activity.ControllerActivity;
import org.infospray.rspicontroller.ui.UpdaterUI;
import android.view.View;
import android.view.View.OnClickListener;

public class ReculerListener implements OnClickListener {

	
	private ControllerActivity activity;
	

	public ReculerListener(ControllerActivity activity) {
		this.activity = activity;
	}


	@Override
	public void onClick(View v) {
		 UpdaterUI.reculer(activity);		
	}

}
