package com.alainmorrondo.helloworld;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class MyAppService extends Service {

	/* (non-Javadoc)
	 * @see android.app.Service#onBind(android.content.Intent)
	 */
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
