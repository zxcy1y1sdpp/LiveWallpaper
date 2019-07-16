package phucnguyen.develop.livewallpaper;

import android.os.Parcel;
import android.os.Parcelable;


public class Image implements Parcelable {
    private String url;
    private String name;

    public Image(String url, String name) {
        this.url = url;
        this.name = name;
    }

    protected Image(Parcel in) {
        url = in.readString();
        name = in.readString();
    }

    public static final Creator<Image> CREATOR = new Creator<Image>() {
        @Override
        public Image createFromParcel(Parcel in) {
            return new Image(in);
        }

        @Override
        public Image[] newArray(int size) {
            return new Image[size];
        }
    };

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(url);
    }
}