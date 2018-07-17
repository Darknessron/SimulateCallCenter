/**
 * 
 */
package simulate.callcenter.chain;

import org.apache.commons.chain.impl.ChainBase;

import simulate.callcenter.chain.command.CustomerServiceCommand;
import simulate.callcenter.chain.command.ProductManagerCommand;
import simulate.callcenter.chain.command.TechnicalLeadCommand;

/**
 * @author Ron
 *
 */
public class ProblemSolveChain extends ChainBase {

	public ProblemSolveChain()	{
		super();
		addCommand(new CustomerServiceCommand());
		addCommand(new TechnicalLeadCommand());
		addCommand(new ProductManagerCommand());
	}
}
