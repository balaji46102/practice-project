package dependencyinjectionpktwo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
   Engine engine;
	 
	public String getEngineDetails() 
	{
		return engine.name;
	}

}
