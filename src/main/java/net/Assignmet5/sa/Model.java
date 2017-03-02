package net.Assignmet5.sa;

import de.uniks.networkparser.graph.Clazz;
import de.uniks.networkparser.graph.DataType;
import org.sdmlib.models.classes.ClassModel;

/**
 * Created by FA on 2/27/2017.
 */
public class Model {
    public static void main(String[] args){
        ClassModel model = new ClassModel("net.Assignmet5.sa");

        Clazz player = model.createClazz("Player")
                .withAttribute("name", DataType.STRING)
                .withAttribute("turn",DataType.BOOLEAN);

        Clazz pits = model.createClazz("Pits")
                .withAttribute("stones", DataType.INT);

        Clazz kalah = model.createClazz("Kalah")
                .withAttribute("stones", DataType.INT);

        model.generate();
    }
}
