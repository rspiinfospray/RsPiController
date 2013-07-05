package org.infospray.rspicontroller.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class CommonCallWs {


	private CommonCallWs() {
		// TODO Auto-generated constructor stub
	}



	public static Boolean callAvancerWs(){

		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_AVANCER);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_AVANCER, envelope);

		} catch (Exception e) {
			System.out.println("WS AVANCER ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callStopWs() {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_STOP);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_STOP, envelope);
		} catch (Exception e) {
			System.out.println("WS STOP ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callReculerWs() {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_RECULER);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_RECULER, envelope);
		} catch (Exception e) {
			System.out.println("WS RECULER ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callGaucheWs() {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_GAUCHE);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_GAUCHE, envelope);

		} catch (Exception e) {
			System.out.println("WS GAUCHE ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callDroiteWs() {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_DROITE);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_DROITE, envelope);

		} catch (Exception e) {
			System.out.println("WS DROITE ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callPuissanceWs(Integer puissance) {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_PUISSANCE);
		requete.addProperty("arg0", Long.valueOf(puissance));

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_PUISSANCE, envelope);

		} catch (Exception e) {
			System.out.println("WS PUISSANCE ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callAlignerRouesWs() {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_ALIGNER_ROUE_MILIEU);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_ALIGNER_ROUE_MILIEU, envelope);

		} catch (Exception e) {
			System.out.println("WS ROUE MILLIEU ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callAutoPiloteOnWs() {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_PILOTE_AUTO_ON);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_PILOTE_AUTO_ON, envelope);

		} catch (Exception e) {
			System.out.println("WS PILOTE AUTO ON ERROR");
			return false;
		}

		return true;
	}



	public static Boolean callAutoPiloteOffWs() {
		SoapObject requete = new SoapObject(ConstantsWs.NAMESPACE, ConstantsWs.METHODE_NAME_PILOTE_AUTO_OFF);

		SoapSerializationEnvelope envelope=  new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(requete);		
		AndroidHttpTransport transport = new org.infospray.rspicontroller.ws.AndroidHttpTransport(ConstantsWs.URL_WEBSERVICE, ConstantsWs.TIMEOUT);


		try {
			transport.call(ConstantsWs.SOAP_ACTION_PILOTE_AUTO_OFF, envelope);

		} catch (Exception e) {
			System.out.println("WS PILOTE AUTO OFF ERROR");
			return false;
		}

		return true;
	}


}
