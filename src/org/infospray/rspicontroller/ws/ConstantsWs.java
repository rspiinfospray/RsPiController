package org.infospray.rspicontroller.ws;

public class ConstantsWs {

	private ConstantsWs(){
		
	}
	
	public static String	URL_WEBSERVICE = "http://192.168.0.150/RsPiSrvWs";
	
	public static String	NAMESPACE = "http://ws.rspi.infospray.org/";
	
	public static String	METHODE_NAME_AVANCER = "avancer";
	
	public static String	SOAP_ACTION_AVANCER = "\"avancer\"";
	
	public static String	METHODE_NAME_STOP = "stop";
	
	public static String	SOAP_ACTION_STOP = "\"stop\"";
	
	public static String	METHODE_NAME_PUISSANCE = "puissance";
	
	public static String	SOAP_ACTION_PUISSANCE = "\"puissance\"";
	
	public static String	METHODE_NAME_RECULER = "reculer";
	
	public static String	SOAP_ACTION_RECULER = "\"reculer\"";
	
	public static String	METHODE_NAME_GAUCHE = "tournerGauche";
	
	public static String	SOAP_ACTION_GAUCHE = "\"tournerGauche\"";
	
	public static String	METHODE_NAME_DROITE = "tournerDroite";
	
	public static String	SOAP_ACTION_DROITE = "\"tournerDroite\"";
	
	public static String	METHODE_NAME_ALIGNER_ROUE_MILIEU = "alignerRoueMilieu";
	
	public static String	SOAP_ACTION_ALIGNER_ROUE_MILIEU  = "\"alignerRoueMilieu\"";
		
	public static String	METHODE_NAME_PILOTE_AUTO_ON = "piloteAutoOn";
	
	public static String	SOAP_ACTION_PILOTE_AUTO_ON = "\"piloteAutoOn\"";
	
	public static String	METHODE_NAME_PILOTE_AUTO_OFF = "piloteAutoOff";
	
	public static String	SOAP_ACTION_PILOTE_AUTO_OFF = "\"piloteAutoOff\"";
	
	public static Integer	TIMEOUT = 3000;
	
	
}
