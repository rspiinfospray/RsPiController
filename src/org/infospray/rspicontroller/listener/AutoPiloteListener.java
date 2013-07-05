package org.infospray.rspicontroller.listener;

import org.infospray.rspicontroller.activity.ControllerActivity;
import org.infospray.rspicontroller.ui.UpdaterUI;
import android.view.View;
import android.view.View.OnClickListener;

public class AutoPiloteListener implements OnClickListener {

	
	private ControllerActivity activity;
	

	public AutoPiloteListener(ControllerActivity activity) {
		this.activity = activity;
	}


	@Override
	public void onClick(View v) {
		
		String result = this.activity.getButtonAutoPilote().getText().toString();
		
		if(result.equals("ON")){
			 UpdaterUI.AutoPiloteOn(activity);
			 System.out.println("ON AUTO PILOTE");
		}
		if(result.equals("OFF")){
			UpdaterUI.AutoPiloteOff(activity);
			System.out.println("OFF AUTO PILOTE");
		}
		
		
		
	}

}
