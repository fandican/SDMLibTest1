package net.Assignmet5.sa.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.IdMap;
import net.Assignmet5.sa.Kalah;

public class KalahPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new KalahPO(new Kalah[]{});
      } else {
          return new KalahPO();
      }
   }
   
   public static IdMap createIdMap(String sessionID) {
      return net.Assignmet5.sa.util.CreatorCreator.createIdMap(sessionID);
   }
}
