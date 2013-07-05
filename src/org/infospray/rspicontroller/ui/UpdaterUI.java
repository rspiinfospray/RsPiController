package org.infospray.rspicontroller.ui;

import org.infospray.rspicontroller.activity.ControllerActivity;


public class UpdaterUI {

	private UpdaterUI() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public static void avancer(ControllerActivity activity){
		
		AvancerAsyncUI asyncAvancer = new AvancerAsyncUI(activity);
		asyncAvancer.execute();
		
	}



	public static void stop(ControllerActivity activity) {
		StopAsyncUI asyncStop = new StopAsyncUI(activity);
		asyncStop.execute();
	}



	public static void droite(ControllerActivity activity) {
		DroiteAsyncUI asyncDroite = new DroiteAsyncUI(activity);
		asyncDroite.execute();
		
	}



	public static void gauche(ControllerActivity activity) {
		GaucheAsyncUI asyncGauche = new GaucheAsyncUI(activity);
		asyncGauche.execute();	
	}



	public static void reculer(ControllerActivity activity) {
		ReculerAsyncUI asyncReculer = new ReculerAsyncUI(activity);
		asyncReculer.execute();
		
	}



	public static void alignerRoues(ControllerActivity activity) {
		AlignerRouesAsyncUI asyncAlignerRoues = new AlignerRouesAsyncUI(activity);
		asyncAlignerRoues.execute();
		
	}



	public static void AutoPiloteOn(ControllerActivity activity) {
		AutoPiloteOnAsyncUI asyncAutoPiloteOn = new AutoPiloteOnAsyncUI(activity);
		asyncAutoPiloteOn.execute();		
	}



	public static void AutoPiloteOff(ControllerActivity activity) {
		AutoPiloteOffAsyncUI asyncAutoPiloteOff = new AutoPiloteOffAsyncUI(activity);
		asyncAutoPiloteOff.execute();
	}
	
	
	
	
}
