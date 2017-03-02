package net.Assignmet5.sa.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.IdMap;
import net.Assignmet5.sa.Pits;

public class PitsPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new PitsPO(new Pits[]{});
      } else {
          return new PitsPO();
      }
   }
   
   public static IdMap createIdMap(String sessionID) {
      return net.Assignmet5.sa.util.CreatorCreator.createIdMap(sessionID);
   }
}
