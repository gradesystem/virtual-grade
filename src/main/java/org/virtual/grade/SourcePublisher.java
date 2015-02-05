package org.virtual.grade;

import javax.xml.transform.Source;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.virtual.grade.configuration.ServiceConfiguration;
import org.virtualrepository.Asset;
import org.virtualrepository.impl.Type;
import org.virtualrepository.spi.Publisher;

@RequiredArgsConstructor
public class SourcePublisher implements Publisher<Asset, Source> {

	@NonNull
	private final ServiceConfiguration configuration;
	
	@Override
	public void publish(Asset asset, Source content) throws Exception {
		
	
	}
	
	
	
	@Override
	public Type<? extends Asset> type() {
		return Type.any;
	}
	
	@Override
	public Class<Source> api() {
		return Source.class;
	}
	
	//////////////////////////////////////////////////////////////////////////////////

}
