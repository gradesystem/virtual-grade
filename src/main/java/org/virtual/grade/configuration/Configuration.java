package org.virtual.grade.configuration;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;


@Data
@RequiredArgsConstructor(staticName="config")
public class Configuration {

	@NonNull @JsonProperty
	private List<ServiceConfiguration> services = new ArrayList<>();
	
}
