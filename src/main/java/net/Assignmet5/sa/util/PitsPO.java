package net.Assignmet5.sa.util;

import org.sdmlib.models.pattern.PatternObject;
import net.Assignmet5.sa.Pits;
import org.sdmlib.models.pattern.AttributeConstraint;
import org.sdmlib.models.pattern.Pattern;

public class PitsPO extends PatternObject<PitsPO, Pits>
{

    public PitsSet allMatches()
   {
      this.setDoAllMatches(true);
      
      PitsSet matches = new PitsSet();

      while (this.getPattern().getHasMatch())
      {
         matches.add((Pits) this.getCurrentMatch());
         
         this.getPattern().findMatch();
      }
      
      return matches;
   }


   public PitsPO(){
      newInstance(null);
   }

   public PitsPO(Pits... hostGraphObject) {
      if(hostGraphObject==null || hostGraphObject.length<1){
         return ;
      }
      newInstance(null, hostGraphObject);
   }

   public PitsPO(String modifier)
   {
      this.setModifier(modifier);
   }
   public PitsPO createStonesCondition(int value)
   {
      new AttributeConstraint()
      .withAttrName(Pits.PROPERTY_STONES)
      .withTgtValue(value)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public PitsPO createStonesCondition(int lower, int upper)
   {
      new AttributeConstraint()
      .withAttrName(Pits.PROPERTY_STONES)
      .withTgtValue(lower)
      .withUpperTgtValue(upper)
      .withSrc(this)
      .withModifier(this.getPattern().getModifier())
      .withPattern(this.getPattern());
      
      super.filterAttr();
      
      return this;
   }
   
   public PitsPO createStonesAssignment(int value)
   {
      new AttributeConstraint()
      .withAttrName(Pits.PROPERTY_STONES)
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
         return ((Pits) getCurrentMatch()).getStones();
      }
      return 0;
   }
   
   public PitsPO withStones(int value)
   {
      if (this.getPattern().getHasMatch())
      {
         ((Pits) getCurrentMatch()).setStones(value);
      }
      return this;
   }
   
}
