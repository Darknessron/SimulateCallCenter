/**
 * 
 */
package simulate.callcenter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import simulate.callcenter.model.ProductManager;
import simulate.callcenter.model.TechnicalLead;

/**
 * @author Ron
 *
 */
@Configuration
public class ApplicationConfig {

	@Bean
	public TechnicalLead getTechnicalLeadInstance()	{
		return TechnicalLead.getSingleton();
	}

	@Bean
	public ProductManager getProductManagerInstance()	{
		return ProductManager.getSingleton();
	}
}
