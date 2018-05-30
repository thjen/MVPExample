package qthjen_dev.io.mvpexample.Presenter.LoadList;

import java.util.ArrayList;
import java.util.List;

import qthjen_dev.io.mvpexample.Model.LoadList.LoadListModel;
import qthjen_dev.io.mvpexample.View.LoadListMain.LoadListView;

public class LoadListPresenter implements LoadListPresenterInterface {

    LoadListView loadListView;

    public LoadListPresenter(LoadListView loadListView) {
        this.loadListView = loadListView;
    }

    @Override
    public void addData() {
        List<LoadListModel> listModels = new ArrayList<>();
        listModels.add(new LoadListModel("Bui bo thjen 1", 1998));
        listModels.add(new LoadListModel("Bui bo thjen 2", 1998));
        listModels.add(new LoadListModel("Bui bo thjen 3", 1998));
        listModels.add(new LoadListModel("Bui bo thjen 4", 1998));
        listModels.add(new LoadListModel("Bui bo thjen 5", 1998));
        listModels.add(new LoadListModel("Bui bo thjen 6", 1998));
        loadListView.load(listModels);
    }
}
