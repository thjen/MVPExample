package qthjen_dev.io.mvpexample.Model.LoadList;

public class LoadListModel {
    private String name;
    private int date;

    public LoadListModel(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
