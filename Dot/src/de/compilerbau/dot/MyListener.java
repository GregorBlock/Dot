/**
 * 
 */
package de.compilerbau.dot;

import de.compilerbau.dot.DOTParser.FileContext;
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
   private String value;
   public String returnValue() 
   {
      return value;
   }

   @Override
   public void enterUncover(UncoverContext ctx)
   {
      value = ctx.children.get(3).getText();
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
      super.enterFile(ctx);
   }

}
