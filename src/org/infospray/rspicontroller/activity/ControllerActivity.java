package org.infospray.rspicontroller.activity;

import org.infospray.rspicontroller.R;
import org.infospray.rspicontroller.listener.AlignerRouesListener;
import org.infospray.rspicontroller.listener.AutoPiloteListener;
import org.infospray.rspicontroller.listener.AvancerListener;
import org.infospray.rspicontroller.listener.DroiteListener;
import org.infospray.rspicontroller.listener.GaucheListener;
import org.infospray.rspicontroller.listener.ReculerListener;
import org.infospray.rspicontroller.listener.SeekBarChangeListener;
import org.infospray.rspicontroller.listener.StopListener;


import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.ToggleButton;


public class ControllerActivity extends Activity {
	
	private Button 				buttonAvancer;
	private Button 				buttonReculer;
	private Button 				buttonDroite;
	private Button 				buttonGauche;
	private Button 				buttonStop;
	private Button 				buttonAlignerRoues;
	private ToggleButton 		buttonAutoPilote;
	private SeekBar				seekBarPuissance;
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		this.buttonAvancer = (Button)findViewById(R.id.buttonAvancer);
		this.buttonReculer = (Button)findViewById(R.id.buttonReculer);
		this.buttonDroite = (Button)findViewById(R.id.buttonDroite);
		this.buttonGauche = (Button)findViewById(R.id.buttonGauche);
		this.buttonStop = (Button)findViewById(R.id.buttonStop);
		this.buttonAlignerRoues = (Button)findViewById(R.id.buttonAlignerRoues);
		this.buttonAutoPilote = (ToggleButton)findViewById(R.id.toggleButtonAuto);
		this.seekBarPuissance = (SeekBar)findViewById(R.id.seekBarPuissance);
		
		
		this.buttonAvancer.setOnClickListener(new AvancerListener(this));
		this.buttonReculer.setOnClickListener(new ReculerListener(this));
		this.buttonDroite.setOnClickListener(new DroiteListener(this));
		this.buttonGauche.setOnClickListener(new GaucheListener(this));
		this.buttonStop.setOnClickListener(new StopListener(this));
		this.buttonAlignerRoues.setOnClickListener(new AlignerRouesListener(this));
		this.buttonAutoPilote.setOnClickListener(new AutoPiloteListener(this));
		this.seekBarPuissance.setOnSeekBarChangeListener(new SeekBarChangeListener(this));
				
    }


	public Button getButtonAvancer() {
		return buttonAvancer;
	}

	public void setButtonAvancer(Button buttonAvancer) {
		this.buttonAvancer = buttonAvancer;
	}

	public Button getButtonReculer() {
		return buttonReculer;
	}

	public void setButtonReculer(Button buttonReculer) {
		this.buttonReculer = buttonReculer;
	}

	public Button getButtonDroite() {
		return buttonDroite;
	}

	public void setButtonDroite(Button buttonDroite) {
		this.buttonDroite = buttonDroite;
	}

	public Button getButtonGauche() {
		return buttonGauche;
	}

	public void setButtonGauche(Button buttonGauche) {
		this.buttonGauche = buttonGauche;
	}

	public Button getButtonAlignerRoues() {
		return buttonAlignerRoues;
	}

	public void setButtonAlignerRoues(Button buttonAlignerRoues) {
		this.buttonAlignerRoues = buttonAlignerRoues;
	}

	public ToggleButton getButtonAutoPilote() {
		return buttonAutoPilote;
	}

	public void setButtonAutoPilote(ToggleButton buttonAutoPilote) {
		this.buttonAutoPilote = buttonAutoPilote;
	}


	public Button getButtonStop() {
		return buttonStop;
	}


	public void setButtonStop(Button buttonStop) {
		this.buttonStop = buttonStop;
	}


	public SeekBar getSeekBarPuissance() {
		return seekBarPuissance;
	}


	public void setSeekBarPuissance(SeekBar seekBarPuissance) {
		this.seekBarPuissance = seekBarPuissance;
	}
    
    
    
    
}
