package net.Assignmet5.sa.util;

import org.sdmlib.models.pattern.util.PatternObjectCreator;
import de.uniks.networkparser.IdMap;
import net.Assignmet5.sa.Player;

public class PlayerPOCreator extends PatternObjectCreator
{
   @Override
   public Object getSendableInstance(boolean reference)
   {
      if(reference) {
          return new PlayerPO(new Player[]{});
      } else {
          return new PlayerPO();
      }
   }
   
   public static IdMap createIdMap(String sessionID) {
      return net.Assignmet5.sa.util.CreatorCreator.createIdMap(sessionID);
   }
}
