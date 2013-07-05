package org.infospray.rspicontroller.listener;

import org.infospray.rspicontroller.activity.ControllerActivity;
import org.infospray.rspicontroller.ui.UpdaterUI;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SeekBarChangeListener implements OnSeekBarChangeListener {

	
	private ControllerActivity activity;
	
	Integer progressChange = 0;

	public SeekBarChangeListener(ControllerActivity activity) {
		this.activity = activity;
	}


	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		progressChange = progress;
		
	}


	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		UpdaterUI.puissance(activity,this.progressChange);
		
	}



}
