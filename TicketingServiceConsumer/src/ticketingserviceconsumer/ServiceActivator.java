package ticketingserviceconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import ticketingserviceproducer.ServiceProduce;


public class ServiceActivator implements BundleActivator {
	
	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Ticketing Consumer Service Started");
		
		serviceReference = context.getServiceReference(ServiceProduce.class.getName());
		
		ServiceProduce servicePublish = (ServiceProduce) context.getService(serviceReference);
		
		System.out.println(servicePublish.publishService());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Ticketing Consumer Service Stop");
		
		context.ungetService(serviceReference);
	}

}
