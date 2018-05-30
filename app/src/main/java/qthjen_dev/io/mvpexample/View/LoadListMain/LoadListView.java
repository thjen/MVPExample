package qthjen_dev.io.mvpexample.View.LoadListMain;

import java.util.List;

import qthjen_dev.io.mvpexample.Adapter.MainAdapter;
import qthjen_dev.io.mvpexample.Model.LoadList.LoadListModel;

public interface LoadListView {
    void load(List<LoadListModel> list);
}
