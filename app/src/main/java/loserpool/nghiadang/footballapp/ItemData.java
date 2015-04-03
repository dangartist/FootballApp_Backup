package loserpool.nghiadang.footballapp;

/**
 * Created by nghia.dang on 3/19/2015.
 */
public class ItemData {

    private String title;
    private int imageicon;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageicon() {
        return imageicon;
    }

    public void setImageicon(int imageicon) {
        this.imageicon = imageicon;
    }

    public ItemData(String title, int imageicon){
        this.title=title;
        this.imageicon=imageicon;
    }
}
