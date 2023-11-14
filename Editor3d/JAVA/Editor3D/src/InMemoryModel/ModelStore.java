package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelEliments.Camera;
import ModelEliments.Flash;
import ModelEliments.PoligonModel;
import ModelEliments.Scene;

public class ModelStore implements IModelChanger {
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
    }

    public Scene getScene(int id)
    {
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }


}
