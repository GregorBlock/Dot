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

   public String returnValue(String value)
   {
      return value;
   }

   @Override
   public void enterUncover(UncoverContext ctx)
   {
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
      System.out.println(ctx.children.get(0).getText());
      System.out.println(ctx.getText());
      super.enterFile(ctx);
   }

}
