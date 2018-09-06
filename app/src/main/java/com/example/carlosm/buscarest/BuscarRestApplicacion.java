package com.example.carlosm.buscarest;

import android.app.Application;

/**
 * Created by Carlos M on 05/09/2018.
 */

public class BuscarRestApplicacion extends Application {


    private Review actualReview;
    private String reviewCriteriaCocina;
    private String reviewCriteriaUbicacion;

    public BuscarRestApplicacion() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public Review getCurrentReview() {
        return this.actualReview;
    }

    public String getReviewCriteriaCuisine() {
        return this.reviewCriteriaCocina;
    }

    public String getReviewCriteriaLocation() {
        return this.reviewCriteriaUbicacion;
    }

    public void setCurrentReview(Review currentReview) {
        this.actualReview = currentReview;
    }

    public void setReviewCriteriaCuisine(String reviewCriteriaCocina) {
        this.reviewCriteriaCocina = reviewCriteriaCocina;
    }

    public void setReviewCriteriaLocation(String reviewCriteriaUbicacion) {
        this.reviewCriteriaUbicacion = reviewCriteriaUbicacion;
    }


}
