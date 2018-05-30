package qthjen_dev.io.mvpexample.View.LoadListMain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import qthjen_dev.io.mvpexample.Adapter.MainAdapter;
import qthjen_dev.io.mvpexample.Model.LoadList.LoadListModel;
import qthjen_dev.io.mvpexample.Presenter.LoadList.LoadListPresenter;
import qthjen_dev.io.mvpexample.R;

public class MainActivity extends AppCompatActivity implements LoadListView {

    RecyclerView recyclerView;
    LoadListPresenter loadListPresenter;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);

        loadListPresenter = new LoadListPresenter(this);
        loadListPresenter.addData();
    }

    @Override
    public void load(List<LoadListModel> list) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new MainAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }
}
