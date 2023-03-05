package hotelbookingserviceproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Ticketing Producer Service Started");
		
        HotelServiceProduce publisherService = new ServiceProduceImpl();
        
        publishServiceRegistration = context.registerService(HotelServiceProduce.class.getName(), publisherService, null);
    }
	

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Ticketing Producer Service Stopped");
		
		publishServiceRegistration.unregister();
	}

}
