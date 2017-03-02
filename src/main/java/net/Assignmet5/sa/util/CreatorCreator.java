package net.Assignmet5.sa.util;

import de.uniks.networkparser.IdMap;

class CreatorCreator{

   public static IdMap createIdMap(String sessionID)
   {
      IdMap jsonIdMap = new IdMap().withSessionId(sessionID);
      jsonIdMap.with(new PlayerCreator());
      jsonIdMap.with(new PlayerPOCreator());
      jsonIdMap.with(new PitsCreator());
      jsonIdMap.with(new PitsPOCreator());
      jsonIdMap.with(new KalahCreator());
      jsonIdMap.with(new KalahPOCreator());
      return jsonIdMap;
   }
}
