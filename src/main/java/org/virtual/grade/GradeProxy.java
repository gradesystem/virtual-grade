package org.virtual.grade;

import static java.util.Arrays.*;
import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.Getter;

import org.virtual.grade.configuration.ServiceConfiguration;
import org.virtualrepository.AssetType;
import org.virtualrepository.spi.Browser;
import org.virtualrepository.spi.Importer;
import org.virtualrepository.spi.MutableAsset;
import org.virtualrepository.spi.Publisher;
import org.virtualrepository.spi.ServiceProxy;

public class GradeProxy implements ServiceProxy {

	@Getter
	Browser browser = new Browser() {
		
		@Override
		public Iterable<? extends MutableAsset> discover(Collection<? extends AssetType> types) throws Exception {
			return emptyList();
		}
	};
	
	@Getter
	List<Importer<?,?>> importers = new ArrayList<Importer<?,?>>();
	
	@Getter
	List<Publisher<?,?>> publishers = new ArrayList<Publisher<?,?>>();
	
	
	public GradeProxy(ServiceConfiguration configuration) {
		
		this.publishers.addAll(asList(
			new SourcePublisher(configuration)
		));
		
	}
	
	
}
