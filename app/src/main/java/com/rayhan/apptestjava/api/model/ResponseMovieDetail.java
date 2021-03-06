package com.rayhan.apptestjava.api.model;

import com.google.gson.annotations.SerializedName;

public class ResponseMovieDetail {

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("imdb_id")
    private String imdbId;

    @SerializedName("video")
    private boolean video;

    @SerializedName("title")
    private String title;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("revenue")
    private int revenue;

    @SerializedName("popularity")
    private double popularity;

    @SerializedName("id")
    private int id;

    @SerializedName("vote_count")
    private int voteCount;

    @SerializedName("budget")
    private int budget;

    @SerializedName("overview")
    private String overview;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("runtime")
    private int runtime;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("vote_average")
    private double voteAverage;

    @SerializedName("belongs_to_collection")
    private Object belongsToCollection;

    @SerializedName("tagline")
    private String tagline;

    @SerializedName("adult")
    private boolean adult;

    @SerializedName("homepage")
    private String homepage;

    @SerializedName("status")
    private String status;

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getImdbId() {
        return imdbId;
    }

    public boolean isVideo() {
        return video;
    }

    public String getTitle() {
        return title;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public int getRevenue() {
        return revenue;
    }

    public double getPopularity() {
        return popularity;
    }

    public int getId() {
        return id;
    }

    public String getVoteCount() {
        return String.valueOf(voteCount);
    }

    public int getBudget() {
        return budget;
    }

    public String getOverview() {
        return overview;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public int getRuntime() {
        return runtime;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getVoteAverage() {
        return String.valueOf(voteAverage);
    }

    public Object getBelongsToCollection() {
        return belongsToCollection;
    }

    public String getTagline() {
        return tagline;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getStatus() {
        return status;
    }
}