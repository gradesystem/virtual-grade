package org.virtual.grade.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor(staticName="config")
public class ServiceConfiguration {

	@NonNull @JsonProperty
	private QName name;
	
	@NonNull @JsonProperty
	private String uri;
	
	@NonNull @JsonProperty
	private String endpoint;
	
	@NonNull @JsonProperty
	private Map<String,String> properties = new HashMap<>();
	
	
	void validate() {
		
		config().name(name).uri(uri).endpoint(endpoint).properties(properties);
	}
	
}
