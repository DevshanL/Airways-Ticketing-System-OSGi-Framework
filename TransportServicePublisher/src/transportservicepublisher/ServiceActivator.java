package transportservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Transportation Service Publisher Started");
        TransportServicePublish publisherService = new TransportServicePublishImpl();
        publishServiceRegistration = context.registerService(TransportServicePublish.class.getName(), publisherService, null);
    }
	

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Transportation Service Publisher Stopped");
		publishServiceRegistration.unregister();
	}

}
