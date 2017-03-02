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
import net.Assignmet5.sa.Kalah;
import de.uniks.networkparser.interfaces.Condition;
import java.util.Collection;
import de.uniks.networkparser.list.NumberList;

public class KalahSet extends SimpleSet<Kalah>
{
	protected Class<?> getTypClass() {
		return Kalah.class;
	}

   public KalahSet()
   {
      // empty
   }

   public KalahSet(Kalah... objects)
   {
      for (Kalah obj : objects)
      {
         this.add(obj);
      }
   }

   public KalahSet(Collection<Kalah> objects)
   {
      this.addAll(objects);
   }

   public static final KalahSet EMPTY_SET = new KalahSet().withFlag(KalahSet.READONLY);


   public KalahPO createKalahPO()
   {
      return new KalahPO(this.toArray(new Kalah[this.size()]));
   }


   public String getEntryType()
   {
      return "net.Assignmet5.sa.Kalah";
   }


   @Override
   public KalahSet getNewList(boolean keyValue)
   {
      return new KalahSet();
   }


   public KalahSet filter(Condition<Kalah> condition) {
      KalahSet filterList = new KalahSet();
      filterItems(filterList, condition);
      return filterList;
   }

   @SuppressWarnings("unchecked")
   public KalahSet with(Object value)
   {
      if (value == null)
      {
         return this;
      }
      else if (value instanceof java.util.Collection)
      {
         this.addAll((Collection<Kalah>)value);
      }
      else if (value != null)
      {
         this.add((Kalah) value);
      }
      
      return this;
   }
   
   public KalahSet without(Kalah value)
   {
      this.remove(value);
      return this;
   }


   /**
    * Loop through the current set of Kalah objects and collect a list of the stones attribute values. 
    * 
    * @return List of int objects reachable via stones attribute
    */
   public NumberList getStones()
   {
      NumberList result = new NumberList();
      
      for (Kalah obj : this)
      {
         result.add(obj.getStones());
      }
      
      return result;
   }


   /**
    * Loop through the current set of Kalah objects and collect those Kalah objects where the stones attribute matches the parameter value. 
    * 
    * @param value Search value
    * 
    * @return Subset of Kalah objects that match the parameter
    */
   public KalahSet filterStones(int value)
   {
      KalahSet result = new KalahSet();
      
      for (Kalah obj : this)
      {
         if (value == obj.getStones())
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Kalah objects and collect those Kalah objects where the stones attribute is between lower and upper. 
    * 
    * @param lower Lower bound 
    * @param upper Upper bound 
    * 
    * @return Subset of Kalah objects that match the parameter
    */
   public KalahSet filterStones(int lower, int upper)
   {
      KalahSet result = new KalahSet();
      
      for (Kalah obj : this)
      {
         if (lower <= obj.getStones() && obj.getStones() <= upper)
         {
            result.add(obj);
         }
      }
      
      return result;
   }


   /**
    * Loop through the current set of Kalah objects and assign value to the stones attribute of each of it. 
    * 
    * @param value New attribute value
    * 
    * @return Current set of Kalah objects now with new attribute values.
    */
   public KalahSet withStones(int value)
   {
      for (Kalah obj : this)
      {
         obj.setStones(value);
      }
      
      return this;
   }

}
