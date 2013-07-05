package org.infospray.rspicontroller.ui;



import org.infospray.rspicontroller.activity.ControllerActivity;
import org.infospray.rspicontroller.ws.CommonCallWs;


import android.app.Activity;
import android.os.AsyncTask;




public class ReculerAsyncUI extends AsyncTask<Void, Integer, Boolean> {


	private ControllerActivity		activity;

	
	
	
	public ReculerAsyncUI(ControllerActivity activity) {
		super();
		this.activity = activity;
	}


	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
	}
	
	


	@Override
	protected void onPostExecute(Boolean result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
	}


	


	@Override
	protected Boolean doInBackground(Void... params) {

		return CommonCallWs.callReculerWs();
	}


	public Activity getActivity() {
		return activity;
	}


	public void setActivity(ControllerActivity activity) {
		this.activity = activity;
	}



	
	
	
}
