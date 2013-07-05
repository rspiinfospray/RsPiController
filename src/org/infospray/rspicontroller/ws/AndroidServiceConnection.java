package org.infospray.rspicontroller.ws;

import java.io.IOException;

import org.ksoap2.transport.ServiceConnectionSE;

public class AndroidServiceConnection extends ServiceConnectionSE {

	public AndroidServiceConnection(String url) throws IOException {
		super(url);
	}

}
