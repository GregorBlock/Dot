/**
 * 
 */
package de.compilerbau.dot;

import de.compilerbau.dot.DOTParser.FileContext;
import de.compilerbau.dot.DOTParser.GraphContext;
import de.compilerbau.dot.DOTParser.OnlyContext;
import de.compilerbau.dot.DOTParser.UncoverContext;

/**
 * TODO Add comment here
 * 
 * @author $Author: $
 * @version $Revision: $, $Date: $ UTC
 */
public class MyListener extends DOTBaseListener
{

    @Override
    public void enterUncover(UncoverContext ctx)
    {
	// System.out.println(ctx. == DOTParser.GRAPH ? "asd" : "asd");
	super.enterUncover(ctx);
    }

    @Override
    public void enterOnly(OnlyContext ctx)
    {
	// TODO Auto-generated method stub
	super.enterOnly(ctx);
    }

    @Override
    public void enterFile(FileContext ctx)
    {
	System.out.println(ctx.getText());
	super.enterFile(ctx);
    }

    @Override
    public void enterGraph(GraphContext ctx)
    {
	super.enterGraph(ctx);
	System.out.println(ctx.getText());
    }

}
