package relationsctrl;
import relationsview.RelationsView;
import relationsmodel.RelationsModel;
import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;

public class RelationsController {
    
    public RelationsController(){
        RelationsView relationsView = new RelationsView();
        RelationsModel relationsModel = new RelationsModel();
        System.out.println("`-New RelationsController instantiated.");
        addRelationsEntry(null,null);
    }
    
    public void addRelationsEntry(Food f, Mood m){
        System.out.println("  `--Adding a relationship entry");
    }
}
