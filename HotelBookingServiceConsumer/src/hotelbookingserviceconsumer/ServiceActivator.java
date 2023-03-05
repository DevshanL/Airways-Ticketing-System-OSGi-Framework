package hotelbookingserviceconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import hotelbookingserviceproducer.HotelServiceProduce;

public class ServiceActivator implements BundleActivator {
	
	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hotel Booking Service Consumer Started");
		serviceReference = context.getServiceReference(HotelServiceProduce.class.getName());
		HotelServiceProduce servicePublish = (HotelServiceProduce) context.getService(serviceReference);
		System.out.println(servicePublish.publishService());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Hotel Booking Service Consumer Stopped");
		context.ungetService(serviceReference);
	}

}
