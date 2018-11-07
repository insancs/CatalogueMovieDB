package com.sanitcode.cataloguemoviedatabase.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class ResultItems implements Parcelable {
    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("id")
    private Long id;

    @SerializedName("overview")
    private String overview;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("title")
    private String title;

    @SerializedName("vote_average")
    private Double rating;

    @SerializedName("vote_count")
    private String voteCount;

    public ResultItems() {
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.backdropPath);
        dest.writeValue(this.id);
        dest.writeString(this.overview);
        dest.writeValue(this.popularity);
        dest.writeString(this.posterPath);
        dest.writeString(this.releaseDate);
        dest.writeString(this.title);
        dest.writeValue(this.rating);
        dest.writeString(this.voteCount);
    }

    protected ResultItems(Parcel in) {
        this.backdropPath = in.readString();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.overview = in.readString();
        this.popularity = (Double) in.readValue(Double.class.getClassLoader());
        this.posterPath = in.readString();
        this.releaseDate = in.readString();
        this.title = in.readString();
        this.rating = (Double) in.readValue(Double.class.getClassLoader());
        this.voteCount = in.readString();
    }

    public static final Creator<ResultItems> CREATOR = new Creator<ResultItems>() {
        @Override
        public ResultItems createFromParcel(Parcel source) {
            return new ResultItems(source);
        }

        @Override
        public ResultItems[] newArray(int size) {
            return new ResultItems[size];
        }
    };

    @Override
    public String toString() {
        return getPosterPath() + getId();
    }
}
