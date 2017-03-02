/*
   Copyright (c) 2017 FA
   
   Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
   and associated documentation files (the "Software"), to deal in the Software without restriction, 
   including without limitation the rights to use, copy, modify, merge, publish, distribute, 
   sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is 
   furnished to do so, subject to the following conditions: 
   
   The above copyright notice and this permission notice shall be included in all copies or 
   substantial portions of the Software. 
   
   The Software shall be used for Good, not Evil. 
   
   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING 
   BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
   NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, 
   DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE. 
 */
   
package net.Assignmet5.sa.util;

import de.uniks.networkparser.list.SimpleSet;
import net.Assignmet5.sa.Pits;
import de.uniks.networkparser.interfaces.Condition;
import java.util.Collection;
import de.uniks.networkparser.list.NumberList;

public class PitsSet extends SimpleSet<Pits>
{
	protected Class<?> getTypClass() {
		return Pits.class;
	}

   public PitsSet()
   {
      // empty
   }

   public PitsSet(Pits... objects)
   {
      for (Pits obj : objects)
      {
         this.add(obj);
      }
   }

   public PitsSet(Collection<Pits> objects)
   {
      this.addAll(objects);
   }

   public static final PitsSet EMPTY_SET = new PitsSet().withFlag(PitsSet.READONLY);


   public PitsPO createPitsPO()
   {
      return new PitsPO(this.toArray(new Pits[this.size()]));
   }


   public String getEntryType()
   {
      return "net.Assignmet5.sa.Pits";
   }


   @Override
   public PitsSet getNewList(boolean keyValue)
   {
      return new PitsSet();
   }


   public PitsSet filter(Condition<Pits> condition) {
      PitsSet filterList = new PitsSet();
      filterItems(filterList, condition);
      return filterList;
   }

   @SuppressWarnings("unchecked")
   public PitsSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Pits>)value);
      }
      else if (value != null)
      {
         this.add((Pits) value);
      }
      
      return this;
   }
   
   public PitsSet without(Pits value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Pits objects and collect a list of the stones attribute values. 
    * 
    * @return List of int objects reachable via stones attribute
    */
   public NumberList getStones()
   {
      NumberList result = new NumberList();
      
      for (Pits obj : this)
      {
         result.add(obj.getStones());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Pits objects and collect those Pits objects where the stones attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Pits objects that match the parameter
    */
   public PitsSet filterStones(int value)
   {
      PitsSet result = new PitsSet();
      
      for (Pits obj : this)
      {
         if (value == obj.getStones())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Pits objects and collect those Pits objects where the stones attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Pits objects that match the parameter
    */
   public PitsSet filterStones(int lower, int upper)
   {
      PitsSet result = new PitsSet();
      
      for (Pits obj : this)
      {
         if (lower <= obj.getStones() && obj.getStones() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Pits objects and assign value to the stones attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Pits objects now with new attribute values.
    */
   public PitsSet withStones(int value)
   {
      for (Pits obj : this)
      {
         obj.setStones(value);
      }
      
      return this;
   }

}
