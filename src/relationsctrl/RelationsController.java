package relationsctrl;
import relationsview.RelationsView;
import relationsmodel.RelationsModel;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;

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
