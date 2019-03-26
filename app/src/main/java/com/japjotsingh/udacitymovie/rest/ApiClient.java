package com.japjotsingh.udacitymovie.rest;

import com.japjotsingh.udacitymovie.model.ApiResponse;
import com.japjotsingh.udacitymovie.model.Movie;
import com.japjotsingh.udacitymovie.model.MovieDetail;
import com.japjotsingh.udacitymovie.model.Review;
import com.japjotsingh.udacitymovie.model.Video;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiClient {
    @GET("movie/top_rated")
    Call<ApiResponse<Movie>> getTopRatedMovies(@Query("language") String language,
                                               @Query("page") String page);

    @GET("movie/popular")
    Call<ApiResponse<Movie>> getudacitymovie(@Query("language") String language,
                                             @Query("page") String page);

    @GET("movie/{id}/reviews")
    Call<ApiResponse<Review>> getReviews(@Path("id") String id);

    @GET("movie/{id}/videos")
    Call<ApiResponse<Video>> getVideos(@Path("id") String id);

    @GET("movie/{id}")
    Call<MovieDetail> getMovieById(@Path("id") String id);
}