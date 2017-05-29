/**
 * Created by dimitris on 5/30/2017.
 */
public class ComponentFactory {
    public UIcomponent getComponent(String component){
        if(component.equals("CHECKBOX")){
            return new CheckBox();
        }
        else if(component.equals("DATEFIELD")){
            return new Datefield();

        }
        else if(component.equals("TEXTFIELD"))
            return new TextField();

        return null;
    }
}
