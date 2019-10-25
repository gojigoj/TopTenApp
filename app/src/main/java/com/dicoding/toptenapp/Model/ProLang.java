package com.dicoding.toptenapp.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class ProLang implements Parcelable {
    private String name;
    private int position;
    private String rating;
    private String changeImg;
    private String changeNumber;
    private String image;
    private String desc;
    private String positionNow;
    private String positionThen;
    private String designer;
    private String developer;
    private String releaseDate;

    public ProLang(String name, int position, String rating, String changeImg, String changeNumber, String image, String desc, String positionNow, String positionThen, String designer, String developer, String releaseDate) {
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.changeImg = changeImg;
        this.changeNumber = changeNumber;
        this.image = image;
        this.desc = desc;
        this.positionNow = positionNow;
        this.positionThen = positionThen;
        this.designer = designer;
        this.developer = developer;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getChangeImg() {
        return changeImg;
    }

    public void setChangeImg(String changeImg) {
        this.changeImg = changeImg;
    }

    public String getChangeNumber() {
        return changeNumber;
    }

    public void setChangeNumber(String changeNumber) {
        this.changeNumber = changeNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPositionNow() {
        return positionNow;
    }

    public void setPositionNow(String positionNow) {
        this.positionNow = positionNow;
    }

    public String getPositionThen() {
        return positionThen;
    }

    public void setPositionThen(String positionThen) {
        this.positionThen = positionThen;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.position);
        dest.writeString(this.rating);
        dest.writeString(this.changeImg);
        dest.writeString(this.changeNumber);
        dest.writeString(this.image);
        dest.writeString(this.desc);
        dest.writeString(this.positionNow);
        dest.writeString(this.positionThen);
        dest.writeString(this.designer);
        dest.writeString(this.developer);
        dest.writeString(this.releaseDate);
    }

    protected ProLang(Parcel in) {
        this.name = in.readString();
        this.position = in.readInt();
        this.rating = in.readString();
        this.changeImg = in.readString();
        this.changeNumber = in.readString();
        this.image = in.readString();
        this.desc = in.readString();
        this.positionNow = in.readString();
        this.positionThen = in.readString();
        this.designer = in.readString();
        this.developer = in.readString();
        this.releaseDate = in.readString();
    }

    public static final Parcelable.Creator<ProLang> CREATOR = new Parcelable.Creator<ProLang>() {
        @Override
        public ProLang createFromParcel(Parcel source) {
            return new ProLang(source);
        }

        @Override
        public ProLang[] newArray(int size) {
            return new ProLang[size];
        }
    };
}
