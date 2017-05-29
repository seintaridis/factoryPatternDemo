public class FactoryPattern {


    public static void main(String[] args) {
        ComponentFactory componentFactory= new ComponentFactory();
        UIcomponent component1= componentFactory.getComponent("CHECKBOX");
        component1.show();

        UIcomponent component2= componentFactory.getComponent("TEXTFIELD");
        component2.show();

        UIcomponent component3= componentFactory.getComponent("DATEFIELD");
        component3.show();
    }
}
