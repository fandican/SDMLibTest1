package net.Assignmet5.sa.util;

import org.sdmlib.models.pattern.PatternObject;
import net.Assignmet5.sa.Kalah;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.Pattern;

public class KalahPO extends PatternObject<KalahPO, Kalah>
{

    public KalahSet allMatches()
   {
      this.setDoAllMatches(true);
      
      KalahSet matches = new KalahSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Kalah) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public KalahPO(){
      newInstance(null);
   }

   public KalahPO(Kalah... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(null, hostGraphObject);
   }

   public KalahPO(String modifier)
   {
      this.setModifier(modifier);
   }
   public KalahPO createStonesCondition(int value)
   {
      new AttributeConstraint()
      .withAttrName(Kalah.PROPERTY_STONES)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public KalahPO createStonesCondition(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(Kalah.PROPERTY_STONES)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public KalahPO createStonesAssignment(int value)
   {
      new AttributeConstraint()
      .withAttrName(Kalah.PROPERTY_STONES)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(Pattern.CREATE)
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public int getStones()
   {
      if (this.getPattern().getHasMatch())
      {
         return ((Kalah) getCurrentMatch()).getStones();
      }
      return 0;
   }
   
   public KalahPO withStones(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Kalah) getCurrentMatch()).setStones(value);
      }
      return this;
   }
   
}
